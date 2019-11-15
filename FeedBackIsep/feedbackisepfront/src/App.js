import React from 'react';
import logo from './logo.svg';
import Header from './components/Header'
import CalendarContainer from './components/CalendarContainer/calendarContainer'
import './App.css';

function App() {
  return (
      <div id={"root"}>
        <Header userFullName ={"Antoine CANARD"} userAvatar = {"../assets/profilLogo.png"}/>
        <CalendarContainer/>
      </div>

  );
}

export default App;
