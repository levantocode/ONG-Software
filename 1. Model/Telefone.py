

class Telefone:

    def __init__(self, telefonePai, telefoneMae, telefoneOutros):
        self.telefonePai    = telefonePai
        self.telefoneMae    = telefoneMae
        self.telefoneOutros = telefoneOutros
        
        





    #  - - - - - - - - - - GETS & SETS - - - - - - - - - -
    ##GETS
    def getTelefonePai(self):
        return self.telefonePai

    def getTelefoneMae(self):
        return self.telefoneMae

    def getTelefoneOutros(self):
        return self.telefoneOutros


    ##SETS
    def setTelefonePai(self, tp):
        self.telefonePai = tp

    def setTelefoneMae(self, tm):
        self.telefoneMae = tm

    def setTelefoneOutros(self, to):
        self.telefoneOutros = to
    
    # - - - - - - - - - - //// /  //// - - - - - - - - - -
