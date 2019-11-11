const styles = theme => ({
    hdContainer :{
       width: "50vw"
    },
    hdButtonAccueil: {
        borderStyle: "solid",
        borderWidth: '1px',
        marginTop: theme.spacing(3),
        marginBottom: theme.spacing(2),
        color : "#000000",
        fontWeight : "bold"
    },
    hdButtonMesMessages: {
        borderStyle: "solid",
        borderWidth: '1px',
        marginLeft: theme.spacing(2),
        marginTop: theme.spacing(3),
        marginBottom: theme.spacing(2),
        width : "8vw",
        color : "#000000",
        fontWeight : "bold",
    },
    hdButtonContacter: {
        borderStyle: "solid",
        borderWidth: '1px',
        marginLeft: theme.spacing(2),
        marginRight: theme.spacing(3),
        marginTop: theme.spacing(3),
        marginBottom: theme.spacing(2),
        color : "#000000",
        fontWeight : "bold"
    },
    hdImgLogoIsep:{
        width : '20vw',
        marginLeft: theme.spacing(2),

    },
    hdImgAvatarLogo:{
        marginRight : theme.spacing(2),
        width: '9vw',
        height: 'auto'
    }

});

export default styles