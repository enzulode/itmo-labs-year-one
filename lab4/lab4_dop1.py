
import time

start_time = time.time()

import xml.etree.ElementTree as ET
import xmltodict
import json


tree = ET.parse('input/timetable.xml')
xml_data = tree.getroot()
xmlstr = ET.tostring(xml_data, encoding='utf-8', method='xml')



data_dict = dict(xmltodict.parse(xmlstr))

with open('output/out_dop1.json', 'w+') as json_file:
    json.dump(data_dict, json_file, sort_keys=True, indent=4)

print("Timex100: " + str((time.time()-start_time) * 100))
