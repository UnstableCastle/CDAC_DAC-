using Microsoft.EntityFrameworkCore.Migrations;
using MySql.EntityFrameworkCore.Metadata;

#nullable disable

namespace Code_First_Make_2_Tables.Migrations
{
    /// <inheritdoc />
    public partial class _1 : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.AlterDatabase()
                .Annotation("MySQL:Charset", "utf8mb4");

            migrationBuilder.CreateTable(
                name: "schools",
                columns: table => new
                {
                    schoolId = table.Column<int>(type: "int", nullable: false)
                        .Annotation("MySQL:ValueGenerationStrategy", MySQLValueGenerationStrategy.IdentityColumn),
                    schoolName = table.Column<string>(type: "varchar(100)", maxLength: 100, nullable: false),
                    city = table.Column<string>(type: "varchar(100)", maxLength: 100, nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_schools", x => x.schoolId);
                })
                .Annotation("MySQL:Charset", "utf8mb4");

            migrationBuilder.CreateTable(
                name: "teachers",
                columns: table => new
                {
                    teacherId = table.Column<int>(type: "int", nullable: false)
                        .Annotation("MySQL:ValueGenerationStrategy", MySQLValueGenerationStrategy.IdentityColumn),
                    tName = table.Column<string>(type: "varchar(100)", maxLength: 100, nullable: false),
                    subject = table.Column<string>(type: "longtext", nullable: false),
                    schoolId = table.Column<int>(type: "int", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_teachers", x => x.teacherId);
                    table.ForeignKey(
                        name: "FK_teachers_schools_schoolId",
                        column: x => x.schoolId,
                        principalTable: "schools",
                        principalColumn: "schoolId",
                        onDelete: ReferentialAction.Cascade);
                })
                .Annotation("MySQL:Charset", "utf8mb4");

            migrationBuilder.CreateIndex(
                name: "IX_teachers_schoolId",
                table: "teachers",
                column: "schoolId");
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropTable(
                name: "teachers");

            migrationBuilder.DropTable(
                name: "schools");
        }
    }
}
