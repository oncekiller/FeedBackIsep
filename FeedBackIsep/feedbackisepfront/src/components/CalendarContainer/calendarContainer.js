import React from 'react';

import WeeksPanel from './WeeksPanel'
import CourseCase from './CoursesPanel/CourseCase/courseCase'
import styles from './materialUI'
import withStyles from "@material-ui/core/styles/withStyles";
import { Container, Row, Col } from 'reactstrap';


const datas = [
    {
        "id": 2,
        "teacher_id": 8,
        "material_id": 4,
        "date_time": "2019-04-01T10:30:00.000Z",
        "duration": 180,
        "teacher" : {
            "id": 8,
            "username": "adubernet",
            "firstname": "Alice",
            "lastname": "Dubernet",
            "status": "ROLE_TEACHER",
            "isep_id": 8,
            "mail": "alice.dubernet@isep.fr",
            "password": "{bcrypt}$2a$10$rAAV9h2YROT29TvBcDu86eNyf5g5e9R1GGB25RHreYfUNdM1Jzwai",
            "avatar": "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAIAAAD8GO2jAAAARklEQVR4nGKZZXGLgRTQsYOZJPVMJKkmA4xaMGrBqAWjFoxaQA3AwvLOhiQNL5dGkKR+6AfRqAWjFoxaMGrBiLAAEAAA//9b4QZIR8FaGQAAAABJRU5ErkJggg==",
            "color": "#888888",
            "parent_id": null,
            "enabled": true
        },
        "material" :{
            "id": 4,
            "name": "Analyse Geopolitique"
        }
    },
    {
        "id": 3,
        "teacher_id": 9,
        "material_id": 6,
        "date_time": "2019-04-02T02:00:00.000Z",
        "duration": 180,
        "teacher": {
            "id": 9,
            "username": "mpepineau",
            "firstname": "Maurice",
            "lastname": "Pepineau",
            "status": "ROLE_TEACHER",
            "isep_id": 9,
            "mail": "maurice.pepineau@isep.fr",
            "password": "{bcrypt}$2a$10$rAAV9h2YROT29TvBcDu86eNyf5g5e9R1GGB25RHreYfUNdM1Jzwai",
            "avatar": "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAIAAAD8GO2jAAAARklEQVR4nGKZZXGLgRTQsYOZJPVMJKkmA4xaMGrBqAWjFoxaQA3AwvLOhiQNL5dGkKR+6AfRqAWjFoxaMGrBiLAAEAAA//9b4QZIR8FaGQAAAABJRU5ErkJggg==",
            "color": "#999999",
            "parent_id": null,
            "enabled": true
        },
        "material" : {
            "id": 6,
            "name": "Big Data"
        }
    },
    {
        "id": 4,
        "teacher_id": 7,
        "material_id": 1,
        "date_time": "2019-04-02T06:00:00.000Z",
        "duration": 180,
        "teacher" : {
            "id": 7,
            "username": "zkaziaoul",
            "firstname": "Zakia",
            "lastname": "Kaziaoul",
            "status": "ROLE_TEACHER",
            "isep_id": 7,
            "mail": "zakia.kaziaoul@isep.fr",
            "password": "{bcrypt}$2a$10$rAAV9h2YROT29TvBcDu86eNyf5g5e9R1GGB25RHreYfUNdM1Jzwai",
            "avatar": "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAIAAAD8GO2jAAAARklEQVR4nGKZZXGLgRTQsYOZJPVMJKkmA4xaMGrBqAWjFoxaQA3AwvLOhiQNL5dGkKR+6AfRqAWjFoxaMGrBiLAAEAAA//9b4QZIR8FaGQAAAABJRU5ErkJggg==",
            "color": "#777777",
            "parent_id": null,
            "enabled": true
        },
        "material" : {
            "id": 1,
            "name": "Genie logiciel"
        }
    }
]
function dateTimeToTime(dateTime) {
    var H = dateTime.getHours()
    var M = dateTime.getMinutes()

    if (H < 10) {
       H = "0" + H
    }
    if (M < 10) {
        M = "0" + M
    }
    return H+ ":" + M
}

function addMinutesToDateTime(dateTime, minutes) {
    const time = dateTime.getTime()
    const newTime = time + minutes*60*1000
    return new Date(newTime)
}

function createData() {
    const createdData = []
    datas.forEach((data)=>{
        const dataPushed = {}
        const start_time = dateTimeToTime(new Date(data.date_time));
        const end_time = dateTimeToTime(addMinutesToDateTime(new Date(data.date_time), data.duration))
        dataPushed.start_time =  start_time
        dataPushed.end_time =  end_time
        dataPushed.room = "L012"
        dataPushed.material_name = data.material.name
        dataPushed.teacher_name = data.teacher.firstname +" "+ data.teacher.lastname
        createdData.push(dataPushed)
    })
    return createdData

}

class CalendarContainer extends React.Component{

    constructor(props){
        super(props);
        this.state = {
            createdData : createData()
        }
    }

    componentDidMount() {
        console.log(this.state.createdData)
    }

    render(){
        const{classes} = this.props;
        return(
            <Container xs={12}>
                <Row>
                    <WeeksPanel/>
                </Row>
                   <CourseCase/>
            </Container>

        )
    }



}



export default withStyles(styles)(CalendarContainer)

