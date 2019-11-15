import React from "react";
import styles from './materialUI'
import withStyles from "@material-ui/core/styles/withStyles";
import Table from '@material-ui/core/Table';
import TableBody from '@material-ui/core/TableBody';
import TableCell from '@material-ui/core/TableCell';
import TableHead from '@material-ui/core/TableHead';
import TableRow from '@material-ui/core/TableRow';
import Paper from '@material-ui/core/Paper';
import Grid from "@material-ui/core/Grid";
import Card from "@material-ui/core/Card";
import CardHeader from "@material-ui/core/CardHeader";
import CardBody from "reactstrap/es/CardBody";



class CourseCase extends React.Component{
    constructor(props){
        super(props);
        this.state = {

        }
    }



    render(){
        const{classes} = this.props;
        return(
            <div>
                <Card>
                    <CardHeader>Header</CardHeader>
                    <CardBody>
                        <CardTitle>Special Title Treatment</CardTitle>
                        <CardText>With supporting text below as a natural lead-in to additional content.</CardText>
                        <Button>Go somewhere</Button>
                    </CardBody>
                    <CardFooter>Footer</CardFooter>
                </Card>
            </div>
        )
    }

}

export default withStyles(styles)(CourseCase)
