-- Gli statement non devono andare a capo
-- insert books
INSERT INTO books (`year`, created_at, isbn, authors, publisher, title, synopsis,number_of_copies) VALUES(2009, '2024-01-08', '9780132350884', 'Robert C. Martin', 'Pearson', 'Clean Code', 'Manual for developers',2);
INSERT INTO books (`year`, created_at, isbn, authors, publisher, title, synopsis,number_of_copies) VALUES(1973, '2024-01-08', '6580132450884', 'Frank Herbert', 'Einaudi', 'Dune', 'A fantasy saga',3);
-- insert borrowings
INSERT INTO borrowings (book_id, expire_date, return_date, start_date, note) VALUES(1, '2024-01-20', null, '2023-12-20', '');
INSERT INTO borrowings (book_id, expire_date, return_date, start_date, note) VALUES(1, 0, '2023-11-11', '2023-10-10', 'Cover is stained');
-- insert book_type
INSERT INTO book_type (name) VALUES('hard cover');
INSERT INTO book_type (name) VALUES('flexible cover');
INSERT INTO book_type (name) VALUES('audiobook');
INSERT INTO book_type (name) VALUES('e-book');
INSERT INTO book_type (name) VALUES('ancient book');
-- insert categories
INSERT INTO categories (description, name) VALUES('age 11 to 19', 'teenagers');
INSERT INTO categories (description, name) VALUES('age 0 to 10', 'children');
INSERT INTO categories (description, name) VALUES('age over 19', 'adult');
INSERT INTO categories (description, name) VALUES('novels', 'fiction');
INSERT INTO categories (description, name) VALUES('reality based books', 'not-fiction');
-- insert users
INSERT INTO `role` (name) VALUES('ADMIN');
INSERT INTO `role` (name) VALUES('USER');
INSERT INTO library_user (email, first_name, last_name, password) VALUES('jane@email.com', 'Jane', 'Doe', '{noop}jane');
INSERT INTO library_user (email, first_name, last_name, password) VALUES('john@email.com', 'John', 'Doe', '{noop}john');
INSERT INTO library_user_role_set (library_user_id, role_set_name) VALUES(1, 'ADMIN');
INSERT INTO library_user_role_set (library_user_id, role_set_name) VALUES(1, 'USER');
INSERT INTO library_user_role_set (library_user_id, role_set_name) VALUES(2, 'USER');