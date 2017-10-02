

class LocalDeEvento:

    def __init__(self, cidade, bairro, rua, pontoEncontro):
        self.cidade        = cidade
        self.bairro        = bairro
        self.rua           = rua
        self.pontoEncontro = pontoEncontro





    #  - - - - - - - - - - GETS & SETS - - - - - - - - - -
    ##GETS
    def getCidade(self):
        return self.cidade

    def getBairro(self):
        return self.bairro

    def getRua(self):
        return self.rua

    def getPontoEncontro(self):
        return self.pontoEncontro


    ##SETS
    def setCidade(self, c):
        self.cidade = c

    def setBairro(self, b):
        self.bairro = b

    def setRua(self, r):
        self.rua = r

    def setPontoEncontro(self, pe):
        self.pontoEncontro = pe
        
    # - - - - - - - - - - //// /  //// - - - - - - - - - -
