from Voluntario import Voluntario

class Treineiro(Voluntario):

    def __init__(self, whatsapp, nome, dtNasc, sexo, rg, end, telefone, probl, usr, snh, dataInscricao, dataInicTrein):
        super(Treineiro, self).__init__(whatsapp, nome, dtNasc, sexo, rg, end, telefone, probl, usr, snh, dataInscricao)

        self.dataInicTrein = dataInicTrein






    #  - - - - - - - - - - GETS & SETS - - - - - - - - - -
    ##GETS
    def getDataInicTrein(self):
        return self.dataInicTrein


    ##SETS
    def setDataInicTrein(self, dit):
        self.dataInicTrein = dit

    # - - - - - - - - - - //// /  //// - - - - - - - - - -
