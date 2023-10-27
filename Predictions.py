import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
from sklearn.metrics import mean_squared_error

# Load historical data
# The structure of your data and the actual path may vary
data = pd.read_csv('historical_sales_data.csv')


X = data.drop('TargetColumn', axis=1)
y = data['TargetColumn']

# Split the data into training and testing sets
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=0)

# Train a predictive model
model = LinearRegression()
model.fit(X_train, y_train)

# Evaluate the model (optional but recommended)
predictions = model.predict(X_test)
print(f'Mean Squared Error: {mean_squared_error(y_test, predictions)}')

