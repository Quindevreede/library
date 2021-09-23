INSERT INTO users (username, password, enabled)
VALUES ('user', '$2a$14$jQIfNov.zkgtzOd/aaBPleSm5B6IhUuklvhrxtdZiDEtoeWWMsHpC', TRUE),
       ('admin', '$2a$14$jQIfNov.zkgtzOd/aaBPleSm5B6IhUuklvhrxtdZiDEtoeWWMsHpC', TRUE);

INSERT INTO authorities (username, authority)
VALUES ('user', 'ROLE_USER'),
       ('admin', 'ROLE_USER'),
       ('admin', 'ROLE_ADMIN');

INSERT INTO books (name, author, country)
VALUES ('Dracula', 'Bram Stoker', 'England'),
       ('Frankenstein', 'Mary Shelley', 'England'),
       ('The Invisible Man', 'H.G. Wells', 'England'),
       ('Fight Club', 'Chuck Palahniuk', 'United States'),
       ('American Psycho', 'Brett Easton Ellis', 'United States'),
       ('Bubba Ho-Tep', 'Joe R Lansdale', 'United States');

