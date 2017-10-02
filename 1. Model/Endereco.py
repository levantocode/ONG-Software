

class Endereco:

    def __init__(self, bairro, rua, numRes, telefone):
        self.bairro   = bairro
        self.rua      = rua
        self.numRes   = numRes
        self.telefone = telefone
        





    #  - - - - - - - - - - GETS & SETS - - - - - - - - - -
    ##GETS
    def getBairro(self):
        return self.bairro

    def getRua(self):
        return self.rua

    def getNumRes(self):
        return self.numRes

    def getTelefone(self):
        return self.telefone


    ##SETS
    def setBairro(self, b):
        self.bairro = b

    def setRua(self, r):
        self.rua = r

    def setNumRes(self, nr):
        self.numRes = nr

    def setTelefone(self, t):
        self.telefone = t
    # - - - - - - - - - - //// /  //// - - - - - - - - - -
