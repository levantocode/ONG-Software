

class Voluntario:
    
    def __init__(self, whatsapp, nome, dtNasc, sexo, rg, end, telefone, probl, usr, snh, dataInscricao):
        self.whatsapp      = whatsapp
        self.nome          = nome
        self.dataNasc      = dtNasc
        self.sexo          = sexo
        self.RG            = rg
        self.endereco      = end
        self.telefone      = telefone
        self.problemas     = probl
        self.username      = usr
        self.senha         = snh
        self.dataInscricao = dataInscricao








    #  - - - - - - - - - - GETS & SETS - - - - - - - - - -
    ##GETS
    def getWhatsapp(self):
        return self.whatsapp

    def getNome(self):
        return self.nome

    def getDataNasc(self):
        return self.dataNasc

    def getSexo(self):
        return self.sexo

    def getRG(self):
        return self.RG

    def getEndereco(self):
        return self.endereco

    def getTelefone(self):
        return self.telefone

    def getProblemas(self):
        return self.problemas

    def getUsername(self):
        return self.username

    def getSenha(self):
        return self.senha
    
    def getDataInscricao(self):
        return self.dataInscricao


    ##SETS
    def setWhatsapp(self, w):
        self.whatsapp = w

    def setNome(self, n):
        self.nome = n

    def setDataNasc(self, d):
        self.dataNasc = d

    def setSexo(self, s):
        self.sexo = s

    def setRG(self, r):
        self.RG = r

    def setEndereco(self, e):
        self.endereco = e

    def setTelefone(self, t):
        self.telefone = t

    def setProblemas(self, p):
        self.problemas = p

    def setUsername(self, u):
        self.username = u

    def setSenha(self, se):
        self.senha = se
    
    def setDataInscricao(self, di):
        self.dataInscricao = di
    
    # - - - - - - - - - - //// /  //// - - - - - - - - - -
