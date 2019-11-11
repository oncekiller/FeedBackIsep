import React from 'react';

import Grid from '@material-ui/core/Grid';
import Tabs from '@material-ui/core/Tabs';
import Tab from '@material-ui/core/Tab';
import styles from './materialUI'
import withStyles from "@material-ui/core/styles/withStyles";
import logo_isep from  "../../assets/logo_isep.svg";
import profilLogo from "../../assets/profilLogo.png"




class Header extends React.Component{

    constructor(props){
        super(props);
        this.state = {
            userFullName : "Antoine CANARD",
            userAvatar : profilLogo
        }
    }

    render(){
        const{classes} = this.props;
        return(
            <Grid container direction="row" alignItems="stretch"  >

                <div>
                    <span>{sessionStorage.getItem("UserAutotentificateFirstname")}  {sessionStorage.getItem("UserAutotentificateLastname")}</span>
                </div>
                <Grid container item xs={3}>
                    <img className={classes.hdImgLogoIsep} src={logo_isep}/>
                </Grid>
                <Grid container item xs={6}>
                    <Tabs
                        indicatorColor="primary"
                        className={classes.hdContainer}
                    >
                        <Tab className={classes.hdButtonAccueil} value={0} label="Accueil" href={""}/>
                        <Tab className={classes.hdButtonMesMessages} value={1} label="Mes messages" href={""}/>
                        <Tab className={classes.hdButtonContacter} value={2} label="Contacter"  href={""}/>
                    </Tabs>
                </Grid>
                <Grid container item xs={2}  direction={"column"} alignItems={"flex-end"}>
                    <p>{this.state.userFullName}</p>
                    <a href={""}>Se déconnecter</a>
                </Grid>
                <Grid container item xs={1}  >
                    <img src={this.state.userAvatar} className={classes.hdImgAvatarLogo}/>
                </Grid>



        </Grid>)
    }



}



export default withStyles(styles)(Header)

