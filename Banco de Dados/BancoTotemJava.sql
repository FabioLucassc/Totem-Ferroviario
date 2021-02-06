CREATE DATABASE TotemJava
GO

---------------------------tabela estacoes
USE [TotemJava]
GO

/****** Object:  Table [dbo].[Estacoes]    Script Date: 03/11/2019 21:59:19 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Estacoes](
	[ID_Est] [int] IDENTITY(1,1) NOT NULL,
	[Nome_Est] [varchar](50) NULL,
 CONSTRAINT [PK_Estacoes] PRIMARY KEY CLUSTERED 
(
	[ID_Est] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

----------------------------tabela horarios
USE [TotemJava]
GO

/****** Object:  Table [dbo].[Horarios]    Script Date: 03/11/2019 21:59:32 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Horarios](
	[IDHor_Est] [int] NOT NULL,
	[HorarioEnt] [varchar](20) NOT NULL,
	[HorarioSai] [varchar](20) NOT NULL
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[Horarios]  WITH CHECK ADD  CONSTRAINT [FK_Horarios_Estacoes] FOREIGN KEY([IDHor_Est])
REFERENCES [dbo].[Estacoes] ([ID_Est])
GO

ALTER TABLE [dbo].[Horarios] CHECK CONSTRAINT [FK_Horarios_Estacoes]
GO

---------------------------tabela log
USE [TotemJava]
GO

/****** Object:  Table [dbo].[Log]    Script Date: 03/11/2019 21:59:46 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Log](
	[NsBilhete_Log] [varchar](12) NOT NULL,
	[DataBilhete_Log] [date] NULL,
	[HoraBilhete_Log] [time](7) NULL,
	[NumCartao_Log] [varchar](16) NULL,
	[EstEmb_Log] [varchar](50) NULL,
	[EstDesemb_Log] [varchar](50) NULL,
	[DataCompra_Log] [date] NULL,
	[HoraEmbarque_Log] [time](7) NULL,
	[QtdBilhetes_Log] [int] NULL,
 CONSTRAINT [PK_Log] PRIMARY KEY CLUSTERED 
(
	[NsBilhete_Log] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

----------------------------insert estacoes

insert into Estacoes values ('Philadelphia')
insert into Estacoes values ('Pennsauken')
insert into Estacoes values ('Lindenwold')
insert into Estacoes values ('Atco')
insert into Estacoes values ('Egg Harbor City')
insert into Estacoes values ('Atlantic City')


------------------------------insert horarios

insert into Horarios values (1,'05:00','06:55')
insert into Horarios values (1,'06:00','07:55')
insert into Horarios values (1,'07:00','08:55')
insert into Horarios values (1,'08:00','09:55')
insert into Horarios values (1,'09:00','10:55')
insert into Horarios values (1,'10:30','12:25')
insert into Horarios values (1,'12:00','13:55')
insert into Horarios values (1,'13:00','14:55')
insert into Horarios values (1,'14:30','16:25')
insert into Horarios values (1,'16:00','17:55')
insert into Horarios values (1,'17:30','19:25')
insert into Horarios values (1,'18:00','19:55')
insert into Horarios values (1,'19:00','20:55')
insert into Horarios values (1,'20:00','21:55')

insert into Horarios values (2,'05:20','06:35')
insert into Horarios values (2,'06:20','07:35')
insert into Horarios values (2,'07:20','08:35')
insert into Horarios values (2,'08:20','09:35')
insert into Horarios values (2,'09:20','10:35')
insert into Horarios values (2,'10:50','12:05')
insert into Horarios values (2,'12:20','13:35')
insert into Horarios values (2,'13:20','14:35')
insert into Horarios values (2,'14:50','16:05')
insert into Horarios values (2,'16:20','17:35')
insert into Horarios values (2,'17:50','19:05')
insert into Horarios values (2,'18:20','19:35')
insert into Horarios values (2,'19:20','20:35')
insert into Horarios values (2,'20:20','21:35')


insert into Horarios values (3,'05:45','06:10')
insert into Horarios values (3,'06:45','07:10')
insert into Horarios values (3,'07:45','08:10')
insert into Horarios values (3,'08:45','09:10')
insert into Horarios values (3,'09:45','10:10')
insert into Horarios values (3,'11:15','11:40')
insert into Horarios values (3,'12:45','13:10')
insert into Horarios values (3,'13:45','14:10')
insert into Horarios values (3,'15:15','15:40')
insert into Horarios values (3,'16:45','17:10')
insert into Horarios values (3,'18:15','18:40')
insert into Horarios values (3,'18:45','19:10')
insert into Horarios values (3,'19:45','20:10')
insert into Horarios values (3,'20:45','21:10')


insert into Horarios values (4,'06:10','05:45')
insert into Horarios values (4,'07:10','06:45')
insert into Horarios values (4,'08:10','07:45')
insert into Horarios values (4,'09:10','08:45')
insert into Horarios values (4,'10:10','09:45')
insert into Horarios values (4,'11:40','11:15')
insert into Horarios values (4,'13:10','12:45')
insert into Horarios values (4,'14:10','13:45')
insert into Horarios values (4,'15:40','15:15')
insert into Horarios values (4,'17:10','16:45')
insert into Horarios values (4,'18:40','18:15')
insert into Horarios values (4,'19:10','18:45')
insert into Horarios values (4,'20:10','19:45')
insert into Horarios values (4,'21:10','20:45')


insert into Horarios values (5,'06:30','05:25')
insert into Horarios values (5,'07:30','06:25')
insert into Horarios values (5,'08:30','07:25')
insert into Horarios values (5,'09:30','08:25')
insert into Horarios values (5,'10:30','09:25')
insert into Horarios values (5,'12:00','10:55')
insert into Horarios values (5,'13:30','12:25')
insert into Horarios values (5,'14:30','13:25')
insert into Horarios values (5,'16:00','14:45')
insert into Horarios values (5,'17:30','16:25')
insert into Horarios values (5,'19:00','17:55')
insert into Horarios values (5,'19:30','18:25')
insert into Horarios values (5,'20:30','19:25')
insert into Horarios values (5,'21:30','20:25')


insert into Horarios values (6,'06:55','05:00')
insert into Horarios values (6,'07:55','06:00')
insert into Horarios values (6,'08:55','07:00')
insert into Horarios values (6,'09:55','08:00')
insert into Horarios values (6,'10:55','09:00')
insert into Horarios values (6,'12:25','10:30')
insert into Horarios values (6,'13:55','12:00')
insert into Horarios values (6,'14:55','13:00')
insert into Horarios values (6,'16:25','14:30')
insert into Horarios values (6,'17:55','16:00')
insert into Horarios values (6,'19:25','17:30')
insert into Horarios values (6,'19:55','18:00')
insert into Horarios values (6,'20:55','19:00')
insert into Horarios values (6,'21:55','20:00')

GO

CREATE VIEW V_BuscaHorario
AS
SELECT Estacoes.ID_Est, Estacoes.Nome_Est,Horarios.HorarioEnt,Horarios.HorarioSai  FROM Horarios inner join Estacoes on Estacoes.ID_Est = Horarios.IDHor_Est 
