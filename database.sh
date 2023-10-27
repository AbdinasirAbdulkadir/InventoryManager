#!/bin/bash
# Script for database backup

DB_USER="root"
DB_PASS="password"
DB_NAME="inventory_system"
BACKUP_PATH="/path/to/your/backup/directory"

mysqldump -u $DB_USER -p$DB_PASS $DB_NAME > $BACKUP_PATH/backup_$(date +%F).sql
