CREATE TABLE ADDRESS(
    address_id INTEGER PRIMARY KEY,
    addresss VARCHAR2(50) NOT NULL,
    last_name VARCHAR2(50) NOT NULL ,
    address_id INTEGER REFERENCES ADDRESS(address_id)

);