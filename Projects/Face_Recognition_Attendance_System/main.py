from flask import Flask, send_file, json, jsonify

app = Flask(__name__)


@app.route('/data')
def hello():
    return jsonify(
        {"name": "Omkar Lohar", "age": 21},
        {"name": "Anurag Dandge ", "age": 22})


@app.route('/image_file')
def image():
    return send_file('D:/MCA (Modern)/2nd Semester/Projects/Face_Recognition_Attendance_System/image.jpg', mimetype='image/jpg')


if __name__ == '__main__':
    app.run()
