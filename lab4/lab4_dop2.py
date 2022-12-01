import time
start_time = time.time()
import re

file = open('input/timetable.xml', 'r', encoding='utf-8')
strarr = re.findall(r'[^\t]*', file.read())

test = []
for i in strarr:
    test.append(re.findall(r'[^\n]*', i))

result = []
for i in test:
    if isinstance(i, list):
        for j in i:
            if j != [''] and j != '' and j != []:
                result.append(j)
    else:
        if i != '' and i != [''] and i != []:
            result.append(i)


buffer = []

data_matcher = re.compile(r'^<[\w+] (?:\w+\=\")[\w+]\"/>$')
remove_brackets = re.compile(r'[<|>|\/]')

remove_meta = re.compile(r'^<\?.*$')
remove_data = re.compile(r'^<\w+>$')
remove_data_extra = re.compile(r'^<\/\w+>$')

for item in result:

    while '  ' in item:
        item = item.strip()
    
    if not (remove_data.match(item)) and not(remove_data_extra.match(item)) and not (remove_meta.match(item)):
        buffer.append(remove_brackets.sub('', item).replace(' ', '&', 1).split('&')[1].replace('=', '&', 1).split('&'))


buffer_json = []
for data in buffer:
    buffer_json.append(f'\"{data[0]}\": {data[1]}')



json = '{\n\t\"timetable\": \n\t\t[\n'
k = 0
zpt_cnt = 0
for i in range(0, len(buffer_json)):
    if k == 0 and i % 5 == 0:
        json += '\t\t\t{\n'
        k = 1
    elif k == 1 and i % 5 == 0:
        json += '\t\t\t},\n'
        k = 2
    
    if k == 2 and i % 5 == 0:
        json += '\t\t\t{\n'
        k = 1
    
    if zpt_cnt < 4:
        zpt_cnt += 1
        json += f'\t\t\t\t{buffer_json[i]},\n'
    else:
        zpt_cnt = 0
        json += f'\t\t\t\t{buffer_json[i]}\n'

json += '\t\t\t}\n\t\t]\n}'

with open('output/lab4_dop2.json', 'w+') as json_file:
    json_file.write(json)

print("TimeX100: " + str((time.time() - start_time) * 100))