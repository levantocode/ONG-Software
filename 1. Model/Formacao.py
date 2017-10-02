

class Formacao:

    def __init__(self, data, horaInicio, horaFim, qtdPresente):
        self.data        = data
        self.horaInicio  = horaInicio
        self.horaFim     = horaFim
        self.qtdPresente = qtdPresente
        




    #  - - - - - - - - - - GETS & SETS - - - - - - - - - -
    ##GETS
    def getData(self):
        return self.data

    def getHoraInicio(self):
        return self.horaInicio

    def getHoraFim(self):
        return self.horaFim

    def getQtdPresent(self):
        return self.qtdPresente


    ##SETS
    def setData(self, d):
        self.data = d

    def setHoraInicio(self, hi):
        self.horaInicio = hi

    def setHoraFim(self, hf):
        self.horaFim = hf

    def setQtdPresent(self, p):
        self.qtdPresente = p

    # - - - - - - - - - - //// /  //// - - - - - - - - - -
