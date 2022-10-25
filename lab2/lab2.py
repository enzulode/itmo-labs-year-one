class HammingCode:

    def __init__(self, code):
        self.code = code

        self.s1 = int(code[0]) ^ int(code[2]) ^ int(code[4]) ^ int(code[6])
        self.s2 = int(code[1]) ^ int(code[2]) ^ int(code[5]) ^ int(code[6])
        self.s3 = int(code[3]) ^ int(code[4]) ^ int(code[5]) ^ int(code[6])

    def checkCode(self):

        if len(self.code) != 7:
            return "Defined code has invalid length"

        for i in self.code:
            if int(i) != 0 and int(i) != 1:
                return "Code is not in binary format"

        if self.s1 == 0 and self.s2 == 0 and self.s3 == 0:
            return f"Code successful. Data is: {self.code[2] + self.code[4] + self.code[5] + self.code[6]}"

        self.erroredBit = 0

        if self.s1 == 1:
            self.erroredBit += 1
        
        if self.s2 == 1:
            self.erroredBit += 2

        if self.s3 == 1:
            self.erroredBit += 4

        return f"Code is errored: bit №{self.erroredBit} is incorrect"
        
         



cc = HammingCode(input())
print(cc.checkCode())