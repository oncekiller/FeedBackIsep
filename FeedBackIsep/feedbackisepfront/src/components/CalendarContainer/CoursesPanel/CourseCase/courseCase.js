import React from "react";
import styles from './materialUI'
import withStyles from "@material-ui/core/styles/withStyles";


class CourseCase extends React.Component{
    constructor(){
        super();
        this.state = {

        }


    }



    render(){
        const{classes} = this.props;
        return(
            <div className={classes.wpWeekNbButtonContainer}>
                <
            </div>
        )
    }

}

export default withStyles(styles)(WeeksPanel)
