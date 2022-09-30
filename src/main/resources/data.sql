INSERT INTO restaurante(id, cep, complemento, nome) VALUES
(1L, '0000001', 'Complemento Endereço Restaurante 1', 'Restaurante 1'),
(2L, '0000002', 'Complemento Endereço Restaurante 2', 'Restaurante 2');

INSERT INTO cliente (id, cep, complemento, name) values
(1L, '0000001', 'Complemento Endereco Cliente 1', 'Cliente 1'),
(2L, '0000002', 'Complemento Endereco Cliente 2', 'Cliente 2');

insert into produto(id, disponivel, name, valor_unitario, restaurante_id) values
(1L, true, 'Produto 1', 5.0, 1L),
(2L, true, 'Produto 2', 6.0, 1L),
(3L, true, 'Produto 3', 7.0, 2L);

insert into sacola(id, forma_pagamento, fechada, valor_total, cliente_id) values
(1L, 0, false, 0.0, 1L);
