

class Brincadeira:

    def __init__(self, nome, qtdCriancas, descricao):
        self.nome        = nome
        self.qtdCriancas = qtdCriancas
        self.descricao   = descricao
        





    #  - - - - - - - - - - GETS & SETS - - - - - - - - - -
    ##GETS
    def getNome(self):
        return self.nome

    def getQtdCriancas(self):
        return self.qtdCriancas

    def getDescricao(self):
        return self.descricao


    ##SETS
    def setNome(self, n):
        self.nome = n

    def setQtdCriancas(self, qc):
        self.qtdCriancas = qc

    def setDescricao(self, d):
        self.descricao = d

    # - - - - - - - - - - //// /  //// - - - - - - - - - -
