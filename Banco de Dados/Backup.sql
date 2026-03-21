CREATE PROCEDURE sp_fazerbackup
AS
BEGIN
    BACKUP DATABASE db_freelacademy
    TO DISK = 'C:\Backup\db_freelacadem.bak'
END