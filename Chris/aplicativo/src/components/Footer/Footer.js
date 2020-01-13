import React from "react";

import { makeStyles } from "@material-ui/core/styles";

import ListItem from "@material-ui/core/ListItem";

import List from "@material-ui/core/List";

import styles from "assets/jss/material-dashboard-react/components/footerStyle.js";

const useStyles = makeStyles(styles);

export default function Footer(props) {
  const classes = useStyles();
  return (
    <footer className={classes.footer}>
      <div className={classes.container}>
        <div className={classes.left}>
          <List className={classes.list}>
            <ListItem className={classes.inlineBlock}>
            </ListItem>
          </List>
        </div>
        <p className={classes.right}>
          <span>
            &copy; {1900 + new Date().getYear()}{" "}
            <a
              href="https://www.creative-tim.com?ref=mdr-footer"
              // target="_blank"
              className={classes.a}
            >
              Savior Pig
            </a>
            Startup de Tecnologia
          </span>
        </p>
      </div>
    </footer>
  );
}
