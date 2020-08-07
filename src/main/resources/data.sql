insert into moneda(nombre) values('sol');
insert into moneda(nombre) values('dolar');
insert into moneda(nombre) values('euro');

insert into tipo_cambio(ID_MONEDA_DESTINO, ID_MONEDA_ORIGEN, TIPO_CAMBIO) values (1, 2, 3.56);
insert into tipo_cambio(ID_MONEDA_DESTINO, ID_MONEDA_ORIGEN, TIPO_CAMBIO) values (2, 1, 0.3);
insert into tipo_cambio(ID_MONEDA_DESTINO, ID_MONEDA_ORIGEN, TIPO_CAMBIO) values (1, 3, 4.12);