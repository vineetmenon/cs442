USE [master]
GO

CREATE DATABASE [CS442]
GO


USE [CS442];
GO

SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO


CREATE TABLE [dbo].[School] (
	id int IDENTITY(0,1),
	name nvarchar(50) NULL,
	district nvarchar(50) NULL,
	county nvarchar(50) NULL,
	schoolType nvarchar(50) NULL,
	totalEnrollment int NULL,
	averageTeacherSalary int NULL,
	averageAct decimal(9,4) NULL,
	percentPassingOverall decimal(9,4) NULL,
	percentPassingIsat decimal(9,4) NULL,
	percentPassingPsae decimal(9,4) NULL,
	percentPassingIaa decimal(9,4) NULL,
	graduationRateOverall decimal(9,4) NULL,
	graduationRateMale decimal(9,4) NULL,
	graduationRateFemale decimal(9,4) NULL,
	graduationRateWhite decimal(9,4) NULL,
	graduationRateBlack decimal(9,4) NULL,
	graduationRateHispanic decimal(9,4) NULL,
	graduationRateAsian decimal(9,4) NULL,
	graduationRateHawaiian decimal(9,4) NULL,
	graduationRateIndian decimal(9,4) NULL,
	graduationRateMultiracial decimal(9,4) NULL,
	graduationRateLep decimal(9,4) NULL,
	graduationRateMigrant decimal(9,4) NULL,
	graduationRateDisabled decimal(9,4) NULL,
	graduationRateLowIncome decimal(9,4) NULL,
	percentWhite decimal(9,4) NULL,
	percentBlack decimal(9,4) NULL,
	percentHispanic decimal(9,4) NULL,
	percentAsian decimal(9,4) NULL,
	percentHawaiian decimal(9,4) NULL,
	percentIndian decimal(9,4) NULL,
	percentMultiracial decimal(9,4) NULL,
	percentLowIncome decimal(9,4) NULL,
	percentLep decimal(9,4) NULL,
	percentIep decimal(9,4) NULL,
	percentHsDropout decimal(9,4) NULL,
	percentChronicTruancy decimal(9,4) NULL,
	percentLowMobility decimal(9,4) NULL,
	attendanceRate decimal(9,4) NULL,
	
	CONSTRAINT School_pk PRIMARY KEY (id)
)
GO

SET ANSI_PADDING OFF
GO

