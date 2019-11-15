import React from "react";
import styles from './materialUI'
import withStyles from "@material-ui/core/styles/withStyles";
import {  Row, Col } from 'reactstrap';




class CourseCase extends React.Component{
    constructor(props){
        super(props);
        this.state = {
            course_material_name : "Math",
            course_room : "L012",
            course_teacher_name : "M.Angarita",
            course_box_color : "#222222",
            start_time : "09:00",
            end_time : "12:00"

        }
    }



    render(){
        const{classes} = this.props;
        return(
            <Row className={classes.ccContainer}>
                    <Col>
                        <Row><p className={classes.p}>{this.state.start_time}</p></Row>
                        <Row><p className={classes.p}>{this.state.end_time}</p></Row>
                    </Col>
                    <Col>
                        <Row>
                            <p className={classes.p}>{this.state.course_material_name}</p>
                        </Row>
                        <Row>
                            <p className={classes.p}>{this.state.course_room}</p>
                        </Row>
                        <Row>
                            <p className={classes.p}>{this.state.course_teacher_name}</p>
                        </Row>
                    </Col>
            </Row>
        )
    }

}

export default withStyles(styles)(CourseCase)
