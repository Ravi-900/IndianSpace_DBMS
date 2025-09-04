# IndianSpace_DBMS

## Overview

**IndianSpace_DBMS** is a database management system project designed to model and manage data related to the Indian Space Research Organization (ISRO). The project demonstrates core DBMS concepts such as ER modeling, normalization, SQL queries, triggers, procedures, and user interface integration.

## Features

- **Entity-Relationship (ER) Model:**  
  Models ISRO’s satellites, missions, launch vehicles, scientists, and ground stations.
- **Normalized Database Schema:**  
  Ensures data integrity and eliminates redundancy.
- **SQL Queries:**  
  Supports complex queries for data retrieval, analysis, and reporting.
- **Stored Procedures & Triggers:**  
  Automates routine tasks and enforces business rules.
- **User Interface:**  
  Simple UI for interacting with the database (insert, update, delete, search).
- **Reports & Analytics:**  
  Generate reports on missions, launches, and satellite status.

## Database Schema

The schema includes tables such as:

- `Satellites`
- `Missions`
- `LaunchVehicles`
- `Scientists`
- `GroundStations`
- Relationships between these entities are managed via foreign keys.

![ER Diagram](ScreenShots/ER_Diagram.png)

## Screenshots

### 1. Home Page

![Home Page](ScreenShots/HomePage.png)

### 2. Satellite Data Entry

![Satellite Entry](ScreenShots/SatelliteEntry.png)

### 3. Mission Report

![Mission Report](ScreenShots/MissionReport.png)

### 4. SQL Query Example

![SQL Query](ScreenShots/SQLQuery.png)

### 5. Trigger Execution

![Trigger Example](ScreenShots/TriggerExecution.png)

## How to Run

1. **Clone the repository:**
   ```sh
   git clone https://github.com/yourusername/IndianSpace_DBMS.git
   cd IndianSpace_DBMS
   ```

2. **Set up the database:**
   - Import the SQL schema from `schema.sql` into your DBMS (e.g., MySQL, PostgreSQL).
   - Run scripts in `procedures.sql` and `triggers.sql` to set up automation.

3. **Start the application:**
   - If there is a UI, run the provided script or open the main file (e.g., `main.py`, `index.html`).

4. **Interact with the system:**
   - Use the UI or SQL queries to manage and analyze ISRO data.

## Technologies Used

- **Database:** MySQL / PostgreSQL
- **Frontend:** HTML/CSS/JS or Python (Tkinter/Flask) [update as per your project]
- **SQL:** Queries, Procedures, Triggers

## Example SQL Query

```sql
-- List all satellites launched after 2015
SELECT name, launch_date FROM Satellites WHERE launch_date > '2015-01-01';
```

## Contributors

- Ravi9
- [Add others]

## License

This project is licensed under the MIT License.

---

**Note:**  
Screenshots are located in the `ScreenShots` folder for reference. Update image paths if your folder structure differs.
