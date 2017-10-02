

class Debito:

    def __init__(self, valorDebito, dataDebito, descDebito, produto):
        self.valorDebito = valorDebito
        self.dataDebito  = dataDebito
        self.descDebito  = descDebito
        self.produto     = produto





    #  - - - - - - - - - - GETS & SETS - - - - - - - - - -
    ##GETS
    def getValorDebito(self):
        return self.valorDebito

    def getDataDebito(self):
        return self.dataDebito

    def getDescDebito(self):
        return self.descDebito

    def getProduto(self):
        return self.produto


    ##SETS
    def setValorDebito(self, vd):
        self.valorDebito = vd

    def setDataDebito(self, dtd):
        self.dataDebito = dtd

    def setDescDebito(self, dsd):
        self.descDebito = dsd

    def setProduto(self, p):
        self.produto = p

    # - - - - - - - - - - //// /  //// - - - - - - - - - -
