import openpyxl

# Create a new workbook
workbook = openpyxl.Workbook()

# Get the active sheet
sheet = workbook.active

# Add data to the sheet
# sheet['A1'] = 'Name'
# sheet['B1'] = 'Age'
# sheet['A2'] = 'John Doe'
# sheet['B2'] = 30
# sheet['A3'] = 'Jane Smith'
# sheet['B3'] = 25

# Save the workbook
workbook.save('example.xlsx')

print("Excel file created successfully!")
