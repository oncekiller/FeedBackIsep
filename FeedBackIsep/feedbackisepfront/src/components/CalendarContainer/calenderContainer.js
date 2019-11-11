import React from 'react';

import WeeksPanel from './WeeksPanel'
import styles from './materialUI'
import withStyles from "@material-ui/core/styles/withStyles";




class CalendarContainer extends React.Component{

    constructor(props){
        super(props);
        this.state = {

        }
    }

    render(){
        const{classes} = this.props;
        return(
            <WeeksPanel/>
        )
    }



}



export default withStyles(styles)(CalendarContainer)

