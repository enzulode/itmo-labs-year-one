# V1: XML -> JSON | Monda
import time

start_time = time.time()

file = open("input/timetable.xml", "r", encoding="utf-8")
file.readline()
xml = file.read()
d, i = 0, 0
data = []

while i < len(xml):
    if xml[i:i+2] == '</' or xml[i:i+2] == '/>':
        d -= 1
    elif xml[i] == '<':
        name = ''
        i += 1
        while xml[i] != ' ' and xml[i] != '>':
            name += xml[i]
            i += 1
        if xml[i] == ' ':
            data.append([d, name])
            d += 1
            while xml[i] != '/' and xml[i] != '>':
                if xml[i] == ' ':
                    name = ''
                    i += 1
                    while xml[i] != ' ' and xml[i] != '=' and xml[i] != '/' and xml[i] != '>':
                        name += xml[i]
                        i += 1
                    if xml[i] == '/' or xml[i] == '>':
                        d -= 1
                        break
                    while xml[i] != '=':
                        i += 1
                    information = ''
                    while xml[i] != '"':
                        i += 1
                    i += 1
                    while xml[i] != '"':
                        information += xml[i]
                        i += 1
                    data.append([d, name, information])
                elif xml[i] == '/':
                    d -= 1
                else:
                    i += 1
        else:
            information = ''
            while xml[i] != '<':
                information += xml[i]
                i += 1
            if xml[i+1]  == '/':
                i += 1
                data.append([d, name, information])
            else:
                data.append([d, name])
                d += 1
            i -= 1
    i += 1

file.close()

filterd_data = []
for d in data:
    if len(d) != 2:
        filterd_data.append(d)

lessOne = filterd_data[0:int(len(filterd_data)/2)]
lessTwo = filterd_data[int(len(filterd_data)/2):len(filterd_data)]

def getLessonInJson(lessonArr):
    
    res_json = "    {\n"
    for i in range(len(lessonArr)):
        if i == len(lessonArr)-1:
            res_json += (f"     \"{lessonArr[i][1]}\": \"{lessonArr[i][2]}\"\n")
        else:
            res_json += (f"     \"{lessonArr[i][1]}\": \"{lessonArr[i][2]}\",\n")
    
    return res_json + "    }"

output_json = "[\n" + (getLessonInJson(lessOne) + ",\n" + getLessonInJson(lessTwo)) + "\n]"
output = open("output/out_base.json", "w", encoding="utf-8")
output.write(output_json)
file.close()

print("Timex100: " + str((time.time()-start_time) * 100))
