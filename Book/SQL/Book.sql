USE [book]
GO

IF EXISTS (SELECT name FROM master.dbo.sysdatabases WHERE name = N'book')
BEGIN
	--ALTER DATABASE [book] SET OFFLINE WITH ROLLBACK IMMEDIATE;
	--ALTER DATABASE [book] SET ONLINE;
	DROP DATABASE book;
END

CREATE DATABASE [book]
GO
USE [book]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 12/28/2020 5:52:31 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account](
	[uID] [int] IDENTITY(1,1) NOT NULL,
	[user] [varchar](255) NULL,
	[pass] [varchar](255) NULL,
	[isSell] [int] NULL,
	[isAdmin] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[uID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Cart]    Script Date: 12/28/2020 5:52:31 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Cart](
	[AccountID] [int] NULL,
	[ProductID] [int] NULL,
	[ProductName] [nvarchar](max) NULL,
	[Quantity] [int] NULL,
	[Amount] [money] NULL,
	[Total] [money] NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Category]    Script Date: 12/28/2020 5:52:31 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Category](
	[cid] [int] NOT NULL,
	[cname] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_Category] PRIMARY KEY CLUSTERED 
(
	[cid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[product]    Script Date: 12/28/2020 5:52:31 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[product](
	[id] [int] IDENTITY(1,1) NOT NULL PRIMARY KEY CLUSTERED ,
	[name] [nvarchar](max) NULL,
	[author] [nvarchar](max) NULL,
	[image] [nvarchar](max) NULL,
	[price] [money] NULL,
	[category] [nvarchar](max) NULL,
	[description] [nvarchar](max) NULL,
	[cateID] [int] NULL,
	[sell_ID] [int] NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Account] ON 
INSERT [dbo].[Account] ([uID], [user], [pass], [isSell], [isAdmin]) VALUES (1, N'dinh', N'2202', 1, 1)
INSERT [dbo].[Account] ([uID], [user], [pass], [isSell], [isAdmin]) VALUES (2, N'TuanLinh', N'deptrai1', 0, 0)
INSERT [dbo].[Account] ([uID], [user], [pass], [isSell], [isAdmin]) VALUES (3, N'chien', N'RXH3XJ', 0, 1)
INSERT [dbo].[Account] ([uID], [user], [pass], [isSell], [isAdmin]) VALUES (4, N'thu', N'HWV8ZN', 0, 0)
INSERT [dbo].[Account] ([uID], [user], [pass], [isSell], [isAdmin]) VALUES (5, N'hoang', N'NPX7OF', 1, 0)
INSERT [dbo].[Account] ([uID], [user], [pass], [isSell], [isAdmin]) VALUES (6, N'hoangmai', N'WIZ5VZ', 1, 0)
INSERT [dbo].[Account] ([uID], [user], [pass], [isSell], [isAdmin]) VALUES (7, N'tung', N'WIZ5VZ', 0, 0)
INSERT [dbo].[Account] ([uID], [user], [pass], [isSell], [isAdmin]) VALUES (8, N'thu', N'WIZ5VZ', 1, 0)
INSERT [dbo].[Account] ([uID], [user], [pass], [isSell], [isAdmin]) VALUES (9, N'phuong', N'WIZ5VZ', 0, 0)
INSERT [dbo].[Account] ([uID], [user], [pass], [isSell], [isAdmin]) VALUES (10, N'Kirby', N'DNX6JK', 1, 0)
INSERT [dbo].[Account] ([uID], [user], [pass], [isSell], [isAdmin]) VALUES (11, N'Tanisha', N'XWU7JP', 0, 1)
INSERT [dbo].[Account] ([uID], [user], [pass], [isSell], [isAdmin]) VALUES (12, N'Howard', N'TSR5MR', 0, 1)
INSERT [dbo].[Account] ([uID], [user], [pass], [isSell], [isAdmin]) VALUES (13, N'Tana', N'EHS8CM', 0, 0)
INSERT [dbo].[Account] ([uID], [user], [pass], [isSell], [isAdmin]) VALUES (14, N'Hadassah', N'YOY7ZW', 1, 0)
INSERT [dbo].[Account] ([uID], [user], [pass], [isSell], [isAdmin]) VALUES (15, N'Echo', N'IGE8TN', 1, 0)
INSERT [dbo].[Account] ([uID], [user], [pass], [isSell], [isAdmin]) VALUES (16, N'Slade', N'OFO6QS', 0, 0)
INSERT [dbo].[Account] ([uID], [user], [pass], [isSell], [isAdmin]) VALUES (17, N'Devin', N'IBM6RZ', 1, 0)
INSERT [dbo].[Account] ([uID], [user], [pass], [isSell], [isAdmin]) VALUES (18, N'Rowan', N'ZYS9VI', 1, 0)
INSERT [dbo].[Account] ([uID], [user], [pass], [isSell], [isAdmin]) VALUES (19, N'Rafael', N'WZA0IH', 1, 0)
INSERT [dbo].[Account] ([uID], [user], [pass], [isSell], [isAdmin]) VALUES (20, N'Madaline', N'QMW4EN', 0, 1)
INSERT [dbo].[Account] ([uID], [user], [pass], [isSell], [isAdmin]) VALUES (21, N'Vera', N'CZB2VM', 0, 1)
INSERT [dbo].[Account] ([uID], [user], [pass], [isSell], [isAdmin]) VALUES (22, N'Declan', N'ZKE7QZ', 1, 1)
INSERT [dbo].[Account] ([uID], [user], [pass], [isSell], [isAdmin]) VALUES (23, N'Katell', N'SFS0IW', 1, 1)
INSERT [dbo].[Account] ([uID], [user], [pass], [isSell], [isAdmin]) VALUES (24, N'Summer', N'PSQ7LC', 0, 1)
INSERT [dbo].[Account] ([uID], [user], [pass], [isSell], [isAdmin]) VALUES (25, N'Robin', N'KIS9AF', 1, 1)
INSERT [dbo].[Account] ([uID], [user], [pass], [isSell], [isAdmin]) VALUES (26, N'Dominique', N'IKV0IX', 0, 0)
INSERT [dbo].[Account] ([uID], [user], [pass], [isSell], [isAdmin]) VALUES (27, N'admin', N'123', 1, 1)
INSERT [dbo].[Account] ([uID], [user], [pass], [isSell], [isAdmin]) VALUES (28, N'mra', N'mra', 0, 0)
INSERT [dbo].[Account] ([uID], [user], [pass], [isSell], [isAdmin]) VALUES (29, N'mrb', N'123', 0, 0)
INSERT [dbo].[Account] ([uID], [user], [pass], [isSell], [isAdmin]) VALUES (30, N'Camden', N'123', 0, 0)

SET IDENTITY_INSERT [dbo].[Account] OFF
INSERT [dbo].[Category] ([cid], [cname]) VALUES (1, N'Kiếm hiệp')
INSERT [dbo].[Category] ([cid], [cname]) VALUES (2, N'Đời sống')
INSERT [dbo].[Category] ([cid], [cname]) VALUES (3, N'Kinh tế')
INSERT [dbo].[Category] ([cid], [cname]) VALUES (4, N'Giáo dục')
INSERT [dbo].[Category] ([cid], [cname]) VALUES (5, N'Manga')
INSERT [dbo].[Category] ([cid], [cname]) VALUES (6, N'Lịch sử')
INSERT [dbo].[Category] ([cid], [cname]) VALUES (7, N'Trinh thám')
INSERT [dbo].[Category] ([cid], [cname]) VALUES (8, N'Kinh dị')
INSERT [dbo].[Category] ([cid], [cname]) VALUES (9, N'Ngôn tình')
INSERT [dbo].[Category] ([cid], [cname]) VALUES (10, N'Tiên hiệp')
SET IDENTITY_INSERT [dbo].[product] ON 

INSERT [dbo].[product] ([id], [name],[author] ,[image], [price], [category], [description], [cateID], [sell_ID]) VALUES (1, 
N'Đấu pha thương khung', 
N'Thiên tằm thổ đậu',
N'images/daupha.jpg', 
100.0000, 
N'Tiên hiệp',
N'– Đấu Phá Thương Khung là một câu chuyện huyền huyễn đặc sắc kể về Tiêu Viêm, một thiên chi kiêu tử với thiên phú tu luyện mà ai ai cũng hâm mộ, bỗng một ngày người mẹ mất đi đễ lại di vật là một chiếc giới chỉ màu đen nhưng từ khi đó Tiêu Viêm đã mất đi thiên phú tu luyện của mình.

– Từ thiên tài rớt xuống làm phế vật trong 3 năm, rồi bị vị hôn thê thẳng thừng từ hôn, làm dấy lên ý chí nam nhi của mình, Tiêu Viêm nhờ di vật của mẫu thân để lại là 1 chiếc hắc giới chỉ (nhẫn màu đen)Tiêu Viêm gặp được hồn của Dược Lão (Dược Trần – Dược tôn giả) 1 đại luyện dược tông sư của đấu khí đại lục…

– Từ đó cuộc đời của Tiêu Viêm có những biến hóa gì? Gặp được các đại ngộ gì? Thân phận thật sự của Huân Nhi (thanh mai trúc mã lúc nhỏ của Tiêu Viêm) ra sao? Bí mật của gia tộc hắn là gì? Cùng theo dõi bộ truyện Đấu Phá Thương Khung để có thể giải đáp các thắc mắc này các bạn nhé!',
10, 1)

INSERT [dbo].[product] ([id], [name],[author] ,[image], [price], [category], [description], [cateID], [sell_ID]) VALUES (2, 
N'Đại chúa tể', 
N'Thiên tằm thổ đậu',
N'images/daichuate.jpg', 
100.0000, 
N'Tiên hiệp',
N'Đại thiên thế giới, nơi các vị diện giao nhau, vạn tộc hiện lên như nấm, quần hùng tụ hội, một vị Thiên chi chí tôn đến từ hạ vị diện tại vô tận thế giới diễn lại một truyền kỳ mà mọi người hướng tới, theo đuổi con đường Chúa tể.

– Hỏa vực vô tận, Viêm Đế nắm giữ, vạn hỏa đốt trời xanh. Trong võ cảnh, Võ Tổ chi uy, chấn nhiếp càn khôn. Bắc Hoang khâu, Vạn Mộ địa, Bất Tử chi chủ trấn thiên địa. Tây Thiên điện, Bách Chiến chi hoàng, chiến uy không thể địch.

– Thiếu niên bước ra từ Bắc Linh cảnh, cưỡi Cửu U Minh Tước xông đến thế giới hỗn loạn đầy đặc sắc, con đường Chúa tể, ai nổi ai chìm? Đại thiên thế giới, vạn đạo tranh phong, ta làm đại chúa tể.

– Ở truyện mới này của Lão Đậu, chúng ta có thể gặp lại Viêm Đế Tiêu Viêm, Huân Nhi, hay Lâm Động trong vũ động càn khôn hay không? Mời bạn đọc cùng tìm hiểu.',
10, 2)

INSERT [dbo].[product] ([id], [name],[author] ,[image], [price], [category], [description], [cateID], [sell_ID]) VALUES (3, 
N'Tiếu ngạo giang hồ', 
N'Kim Dung',
N'images/tieungaogiangho.jpg', 
100.0000, 
N'Kiếm hiệp',
N'Hai sư huynh sư đệ Hành sơn, Mặc Ðại và Lưu Chính Phong cùng vang danh với kiếm.... nhưng cũng không ai nhường ai trong tiếng đàn... người thì... tiếng đàn cao lanh lảnh oai hùng... người thì.. trầm lắng như dứt như không... Để rồi cả hai phải đối diện nhau trong tư thế... chính... tà!',
1, 3)

INSERT [dbo].[product] ([id], [name],[author] ,[image], [price], [category], [description], [cateID], [sell_ID]) VALUES (4, 
N'Tam sinh tam thế-Thập lý đào hoa', 
N'Đường thất công tử',
N'images/tamsinh.jpg', 
100.0000, 
N'Ngôn tình',
N'Tam Sinh Tam Thế – Thập Lý Đào Hoa truyện thuộc thể loại ngôn tình cổ đại của tác giả Đường Thất Công Tử rất nổi tiếng mà người đọc mê truyện không thể bỏ qua được.

Dòng tộc nhà Bạch Đế Hồ Quân sinh ra được bốn người con trai và một nữ nhân duy nhất, nàng xinh đẹp nổi tiếng nhưng rốt cuộc cũng chỉ là một trò đùa của sinh mệnh, sống tới mười bốn vạn tuổi bất quá cũng chỉ gặp được năm đóa hoa đào.

Trong năm đóa lại chỉ có một vị phu quân đúng ý nàng nhất là vị thái tử Dạ Hoa ở nơi Cửu Trùng Thiên vướng bận những ân oán nàng thầm tiếc nuối không gặp được hắngiữa những giây phút thanh xuân tốt đẹp nhất trong đời mình..',
9, 4)

SET IDENTITY_INSERT [dbo].[product] ON 

INSERT [dbo].[product] ([id], [name],[author] ,[image], [price], [category], [description], [cateID], [sell_ID]) VALUES (5, 
N'Nghìn lẻ một đêm', 
N'Nhiều tác giả',
N'images/tamsinh.jpg', 
150.000, 
N'Giáo dục',
N'Nghìn lẻ một đêm, tác phẩm vĩ đại bậc nhất của nền văn học A Rập, là một trong những công trình sáng tạo phong phú và hoàn mỹ của nền văn học thế giới.


Để tựa bản dịch tiếng Nga xuất bản năm 1929 ở Sankt Peterburg, Macxim Gorki viết: “Trong số các di tích tuyệt diệu của sáng tác truyền khẩu dân gian, các truyện cổ tích của nàng Sêhêrazát là di tích đồ sộ nhất.


Những truyện cổ tích này thể hiện với mức hoàn hảo kỳ diệu, xu hướng của nhân dân lao động muốn buông mình theo phép nhiệm màu của những ảo giác êm đẹp, theo sự kết hợp phóng khoáng của từ ngữ thể hiện sức mạnh vũ bão của trí tưởng tượng hoa mỹ của các dân tộc phương Đông – người A Rập, người Ba Tư, người Ấn Độ. Công trình dệt gấm bằng từ ngữ này xuất hiện từ thời tối cổ, những sợi tơ muôn màu của nó lan khắp bốn phương, phủ lên trái đất một tấm thảm từ ngữ đẹp lạ lùng.”


Truyện mở đầu tất cả các truyện, giải thích lý do ra đời của tất cả các truyện, cái khâu đầu tiên của sợi dây chuyền vàng xuyên qua mọi tình tiết, liên kết chúng lại thành một chuỗi ngọc tuyệt tác muôn vẻ muôn màu rồi vòng trở lại để làm thành đoạn kết thúc, là chuyện của một người con gái. Một người con gái tài sắc vẹn toàn, thông minh rất mực, đã không quản hiểm nguy dám hi sinh tấm thân ngà ngọc của mình để cứu các bạn gái khỏi cảnh ô nhục và cái chết bi thương....',
4, 1)

INSERT [dbo].[product] ([id], [name],[author] ,[image], [price], [category], [description], [cateID], [sell_ID]) VALUES (6, 
N'Tôi tài giỏi bạn cũng thế', 
N'Adam Khoo',
N'images/daupha.jpg', 
99.000, 
N'Giáo dục',
N'“Thật không biết phải làm sao với con trai chúng tôi. Nó được gởi đi học thêm khắp nơi mà vẫn làm bài thi tệ hại. Chúng tôi tự hỏi sau này nó có làm nên trò trống gì không nữa”…

Đó chính là những gì mà cha mẹ của Adam Khoo đã từng than vãn về sự kém cõi và kết quả thi cử thảm hại của cậu bé Adam nhiều năm về trước. May mắn thay, vào thời điểm tăm tối nhất trong đời, Adam đã tìm thấy và học tập theo công thức thành công của những người tài giỏi vượt bậc. Chính vì thế, từ một cậu học trò kém cỏi nhất trong số những học sinh kém, không những anh đã vươn lên để đạt đuợc kết quả xuất sắc trong các kỳ thi cuối cấp hai và cấp ba, anh còn đuợc xếp hạng trong số 1% sinh viên tài năng nhất của trường Đại học Quốc Gia Singapore (NUS).

Tôi tài giỏi, bạn cũng thế ! tổng hợp những kỹ năng và phương pháp đã mang tới thành công vượt bậc cho cậu bé Adam kém cõi và dĩ nhiên bạn cũng có thể thành công như vậy! Quyển sách này dành cho các học sinh, sinh viên, các bậc phụ huynh, các nhà giáo và bất kỳ ai luôn mong muốn tăng cường khả năng tận dụng não bộ hoặc phát huy tối đa tiềm năng của mình.',
4, 1)

INSERT [dbo].[product] ([id], [name],[author] ,[image], [price], [category], [description], [cateID], [sell_ID]) VALUES (7, 
N'The design and Analysis of computer Algorithms', 
N'Alfred V. Aho , John E. Hopcroft , Jeffrey D. Ullman',
N'images/daupha.jpg', 
150.000, 
N'Giáo dục',
N'Đây là cuốn sách huyền thoại giúp bạn hiểu biết về các khái niệm cơ bản của thuật toán - trung tâm của khoa học máy tính. Nó giới thiệu các cấu trúc dữ liệu cơ bản và kỹ thuật lập trình thường được sử dụng trong các thuật toán hiệu quả. 

Các thuật toán đó bao gồm việc sử dụng danh sách, ngăn xếp đẩy xuống, hàng đợi, cây và biểu đồ. Các chương sau đi sâu vào các thuật toán sắp xếp, tìm kiếm và vẽ đồ thị, các thuật toán khớp chuỗi và thuật toán nhân số nguyên Schonhage-Strassen. Cung cấp nhiều bài tập được phân loại ở cuối mỗi chương.',
4, 1)

INSERT [dbo].[product] ([id], [name],[author] ,[image], [price], [category], [description], [cateID], [sell_ID]) VALUES (8, 
N'Introduction to Algorithms', 
N'Thomas H. Cormen , Charles E. Leiserson , Ronald L. Rivest và Clifford Stein',
N'images/daupha.jpg', 
150.000, 
N'Giáo dục',
N'Cuốn sách này đã được sử dụng rộng rãi làm sách giáo khoa cho các khóa học thuật toán tại nhiều trường đại học và thường được trích dẫn làm tài liệu tham khảo cho các thuật toán trong các bài báo được xuất bản. Chính vì thế đây là một nguồn học thuật toán rất chất lượng cho bạn.

Trong lời nói đầu, các tác giả viết về cách cuốn sách được viết để trở nên toàn diện và hữu ích trong cả môi trường giảng dạy và chuyên nghiệp. Mỗi chương tập trung vào một thuật toán và thảo luận về các kỹ thuật thiết kế và các lĩnh vực ứng dụng của nó.

Thay vì sử dụng một ngôn ngữ lập trình cụ thể, các thuật toán được viết bằng mã giả . Các mô tả tập trung vào các khía cạnh của chính thuật toán, các thuộc tính toán học của nó và nhấn mạnh hiệu quả.',
4, 1)

SET IDENTITY_INSERT [dbo].[product] OFF

