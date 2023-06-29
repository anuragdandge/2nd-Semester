import tkinter as tk
from pytube import YouTube

def download_video():
    video_url = url_entry.get()
    resolution = resolution_var.get()
    
    try:
        youtube = YouTube(video_url)
        video = youtube.streams.filter(res=resolution).first()
        video.download()
        status_label.config(text="Download successful!")
    except Exception as e:
        status_label.config(text="Error occurred during download.")

# Create the main window
window = tk.Tk()
window.title("YouTube Video Downloader")
window.geometry("400x200")

# URL Entry
url_label = tk.Label(window, text="YouTube Video URL:")
url_label.pack()
url_entry = tk.Entry(window, width=50)
url_entry.pack()

# Resolution Selection
resolution_label = tk.Label(window, text="Select Resolution:")
resolution_label.pack()

resolution_var = tk.StringVar(window)
resolution_var.set("720p")  # Default resolution

resolution_options = ["1080p", "720p", "480p", "360p"]
resolution_dropdown = tk.OptionMenu(window, resolution_var, *resolution_options)
resolution_dropdown.pack()

# Download Button
download_button = tk.Button(window, text="Download", command=download_video)
download_button.pack()

# Status Label
status_label = tk.Label(window, text="")
status_label.pack()

# Run the GUI
window.mainloop()
