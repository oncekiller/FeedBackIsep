import React from "react";
import styles from './materialUI'
import withStyles from "@material-ui/core/styles/withStyles";


class WeeksPanel extends React.Component{
    constructor(){
        super();
        this.state = {
            selectedNumber : 2
        }


    }

    handleClick (e) {
        this.setState({selectedNumber : e.target.value})
    }

    createTable = () => {
        const{classes} = this.props;
        let table = []

        for (let i = 1; i <= 52; i++) {
            if (i!=this.state.selectedNumber) {
                table.push(
                    <button className={classes.wpWeekNbButton} value={i} href={""} onClick={(e) => this.handleClick(e,i)}>{i}</button>
                )
            }else {
                table.push(
                    <button className={classes.wpWeekNbButtonSelected} value={i} href={""} onClick={(e) => this.handleClick(e,i)}>{i}</button>
                )
            }

        }
        return table
    }
    render(){
        const{classes} = this.props;
        return(
            <div className={classes.wpWeekNbButtonContainer}>
                {this.createTable()}
            </div>
        )
    }

}

export default withStyles(styles)(WeeksPanel)
