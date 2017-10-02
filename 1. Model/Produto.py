

class Produto:

    def __init__(self, nome, tipo, desc):
        self.nome      = nome
        self.tipo      = tipo
        self.descricao = desc





    #  - - - - - - - - - - GETS & SETS - - - - - - - - - -
    ##GETS
    def getNome(self):
        return self.nome

    def getTipo(self):
        return self.tipo

    def getDescricao(self):
        return self.descricao


    ##SETS
    def setNome(self, n):
        self.nome = n

    def setTipo(self, t):
        self.tipo = t

    def setDescricao(self, d):
        self.descricao = d
    # - - - - - - - - - - //// /  //// - - - - - - - - - -
