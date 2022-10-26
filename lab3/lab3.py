import re

class Lab3:
    
    def __init__(self):
        # self.pattern3_0 = re.compile(r"(?:\w)(-)(?:\w)")
        # self.pattern3_0 = re.compile(r"(?:\w)(-)(?:\w)")
    
        self.pattern1 = re.compile(r"(\[)(\<\{)(\|)")
        self.counter1 = 0

        self.pattern2 = re.compile(r"(\b\w*([аеёиоуыэюя])([аеёиоуыэюя])\w*\b\s\b\w*\b)")
        self.pattern2_2 = re.compile(r"[^аеёиоуыэюя]")

        self.pattern3 = re.compile(r"(?:[аеёиоуыэюя])")
        self.pattern3_2 = re.compile(r"[аеёиоуыэюя]")


# 
# TASK 1
# 
    def t1(self):
        testsOne = ["[<{|", ":-(", "X<{P", "8-{O", "[<{|"]
    
        for test in testsOne:
            if re.match(self.pattern1, test):
                self.counter1 += 1

        print("Task 1")
        print(f"Test cases: {testsOne}")
        print(f"Matches: {self.counter1}")
        print("---------------------------------------------")

# 
# TASK 2
# 
    def t2(self):
        print("Task 2")
        testsTwo = [
        "Кривошеее существо гуля-ет по парку",
        "Кривошеее существо гуляет по-парку",
        "Бык тупогуб тупогубенький бычок у быка губа тупа",
        "От топота копыт пыль по полю летит",
        "Толком толковать да без толку расперетолковывать",
        "Ткет ткач ткани на платье Тане",
        "пыапа ротфыв",
        "ыйией дзфва"
        ]

        print(f"Test cases: {testsTwo}")
        print("Results: ")

        for test in testsTwo:
            test = re.sub(re.compile(r"[\W]"), " ", test)
            while "  " in test:
                test = test.replace("  ", " ")

            match1 = self.pattern2.findall(test)

            for i in match1:
                t = i[0].split()
                k = self.pattern2_2.findall(t[1])
                
                if len(k) <= 3:
                    print(t[0])
        print("---------------------------------------------")


# 
# TASK 3
# 
    def t3(self):
        print("Task 3")
        testsThree = [
            "Кла-ссное сло-во – обороносп-особность, которое дол-жно идти после слов: трава и молоко.",
            "Грабли – грести, метла – мести, весла – везти, полозья – ползти."
            "Цапля чахла, цапля сохла, ца-пля сдохла.",
            "Ропортов-oл, да не дорапортовал, а стал дорапортовывать, зарапортовался.",
            "Около кола колокола, около ворот коловорот."
        ]

        print(f"Test cases: {testsThree}")
        print("Results: ")

        for test in testsThree:
            ww = test.split()
            result = []

            new_words = []
            for w in ww:
                if (re.match(r"\w+[\W]\w+", w)):
                    new_words.append(w)
                else:
                    new_words.append(re.sub(r"[\W]", "", w))
            
            while ("" in new_words) or (" " in new_words):
                new_words.remove("")

            for word in new_words:
                a = set(self.pattern3_2.findall(word))
                
                if (len(list(a)) == 1):
                    result.append(word)
            
            self.lenSort(result)

        print("---------------------------------------------")


##########################################

    def lenSort(self, list):
        
        print("---List output---")
        for i in range(len(list)-1):
            for j in range(len(list)-i-1):
                if len(list[j]) > len(list[j+1]):
                    buff = list[j]
                    list[j] = list[j+1]
                    list[j+1] = buff

        for el in list:
            print(el)
        print("-----------------")

    def results(self):
        self.t1()   
        self.t2()
        self.t3()




labObject = Lab3()
labObject.results()