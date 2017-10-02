

class Evento:

    def __init__(self, data, horaInicio, horaFim, brincadeiras, localEvento, economia):
        self.data         = data
        self.horaInicio   = horaInicio
        self.horaFim      = horaFim
        self.brincadeiras = brincadeiras
        self.localEvento  = localEvento
        self.economia     = economia



    



    #  - - - - - - - - - - GETS & SETS - - - - - - - - - -
    ##GETS
    def getData(self):
        return self.data

    def getHoraInicio(self):
        return self.horaInicio

    def getHoraFim(self):
        return self.horaFim

    def getBrincadeiras(self):
        return self.brincadeiras

    def getLocalEvento(self):
        return self.localEvento

    def getEconomia(self):
        return self.economia


    ##SETS
    def setData(self, d):
        self.data = d

    def setHoraInicio(self, hi):
        self.horaInicio = hi

    def setHoraFim(self, hf):
        self.horaFim = hf

    def setBrincadeiras(self, b):
        self.brincadeiras = b

    def setLocalEvento(self, le):
        self.localEvento = le

    def setEconomia(self, e):
        self.economia = e
    
    # - - - - - - - - - - //// /  //// - - - - - - - - - -
