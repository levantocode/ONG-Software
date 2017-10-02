from Voluntario    import Voluntario
from Telefone      import Telefone
from Endereco      import Endereco

from Treineiro     import Treineiro
from Coordenador   import Coordenador

from Evento        import Evento
from LocalDeEvento import LocalDeEvento
from Brincadeira   import Brincadeira

from Economia      import Economia
from Credito       import Credito
from Debito        import Debito

from Produto       import Produto

from Formacao      import Formacao








e1  = Endereco('Depois do Luso', 'Rua das Flores', '62', 'não tem')
te1 = Telefone('(12) 91234-5678', '(12) 98765-4321', 'nao tem')

v1  = Voluntario('(12) 98164-9228', 'Caio', '25/04/19997', 'Homem', '55.467.196-2', e1, te1, 'Nenhum', 'contacaio', '123', '29/11/2016')

t1  = Treineiro('(12) 94321-8765', 'Gabriel', '30/10/19997', 'Homem', '46.766.096-7', e1, te1, 'Nenhum', 'contagabriel', '123456', '02/06/2016', '02/10/2017')

