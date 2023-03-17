INSERT INTO artist(artist_label, artist_name, artist_description) VALUES ('led_zeppelin', 'Led Zeppelin', 'British Rock music pioneers'),('van_halen', 'Van Halen', 'Ultimate party rock band spanning decades');
-- Start with 2 votes for Led Zeppelin
SET @zeppelin_id := (SELECT artist_id FROM artist WHERE
artist_label='led_zeppelin');
INSERT INTO vote(artist_id) VALUES(@zeppelin_id);
INSERT INTO vote(artist_id) VALUES(@zeppelin_id);
-- Start with 5 votes for Van Halen
SET @halen_id := (SELECT artist_id FROM artist WHERE artist_label='van_halen');
INSERT INTO vote(artist_id) VALUES(@halen_id);
INSERT INTO vote(artist_id) VALUES(@halen_id);
INSERT INTO vote(artist_id) VALUES(@halen_id);
INSERT INTO vote(artist_id) VALUES(@halen_id);
INSERT INTO vote(artist_id) VALUES(@halen_id);
