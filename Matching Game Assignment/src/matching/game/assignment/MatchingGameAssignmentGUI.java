package matching.game.assignment;

/*
 Programmer: Jeanie (Tsz-Ying) Ng
 Date: 9 August 2018
 Program Name: Matching Game
 Program Description: This program uses arrays to simulate a matching game. 
 * A grid of cards will be displayed and the user is to select 2 cards at a time
 * looking for matching cards. The goal of this game is to see how quickly 
 * the user can find all the matches.
 */

import java.util.*;
import javax.swing.ImageIcon;

public class MatchingGameAssignmentGUI extends javax.swing.JFrame {

    ArrayList<String> cards = new ArrayList<String>(); //Creates a new array list of strings called "cards"
    ArrayList<String> set = new ArrayList<String>(); //Creats a new array list of strings called "set"
    ImageIcon a = new ImageIcon("A!.jpg"); //Creates variable ImageIcon a and stores A!.jpg 
    ImageIcon b = new ImageIcon("B!.png"); //Creates variable ImageIcon b and stores B!.png
    ImageIcon c = new ImageIcon("C!.jpg"); //Creates variable ImageIcon c and stores C!.jpg 
    ImageIcon d = new ImageIcon("D!.jpg"); //Creates variable ImageIcon d and stores D!.jpg 
    ImageIcon e = new ImageIcon("E!.jpg"); //Creates variable ImageIcon e and stores E!.jpg 
    ImageIcon f = new ImageIcon("F!.gif"); //Creates variable ImageIcon f and stores F!.gif 
    ImageIcon back = new ImageIcon("Card Background!.jpg"); //Creates variable ImageIcon back and stores Card Background!.jpg 
    ImageIcon done = new ImageIcon("Done!.png"); //Creates variable ImageIcon done and stores Done!.png 
    int count, c1, c2; //Declares integer variables count, c1, and c2 
    int[] change = new int[12]; //Delcares integer array with length 12
    
    public MatchingGameAssignmentGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblJeanieNg = new javax.swing.JLabel();
        Card1 = new javax.swing.JButton();
        Card2 = new javax.swing.JButton();
        Card3 = new javax.swing.JButton();
        Card4 = new javax.swing.JButton();
        Card5 = new javax.swing.JButton();
        Card6 = new javax.swing.JButton();
        Card7 = new javax.swing.JButton();
        Card8 = new javax.swing.JButton();
        Card9 = new javax.swing.JButton();
        Card10 = new javax.swing.JButton();
        Card11 = new javax.swing.JButton();
        Card12 = new javax.swing.JButton();
        btnPlay = new javax.swing.JButton();
        btnGuessAgain = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtInstructionsOutput = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Matching Game");

        pnlBackground.setBackground(new java.awt.Color(255, 204, 204));

        lblTitle.setFont(new java.awt.Font("Vladimir Script", 0, 48)); // NOI18N
        lblTitle.setText("Matching Game!");

        lblJeanieNg.setText(" © Jeanie (Tsz-Ying) Ng");

        Card1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jeanie\\Documents\\NetBeansProjects\\Matching Game Assignment\\Card Background!.jpg")); // NOI18N
        Card1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card1ActionPerformed(evt);
            }
        });

        Card2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jeanie\\Documents\\NetBeansProjects\\Matching Game Assignment\\Card Background!.jpg")); // NOI18N
        Card2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card2ActionPerformed(evt);
            }
        });

        Card3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jeanie\\Documents\\NetBeansProjects\\Matching Game Assignment\\Card Background!.jpg")); // NOI18N
        Card3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card3ActionPerformed(evt);
            }
        });

        Card4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jeanie\\Documents\\NetBeansProjects\\Matching Game Assignment\\Card Background!.jpg")); // NOI18N
        Card4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card4ActionPerformed(evt);
            }
        });

        Card5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jeanie\\Documents\\NetBeansProjects\\Matching Game Assignment\\Card Background!.jpg")); // NOI18N
        Card5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card5ActionPerformed(evt);
            }
        });

        Card6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jeanie\\Documents\\NetBeansProjects\\Matching Game Assignment\\Card Background!.jpg")); // NOI18N
        Card6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card6ActionPerformed(evt);
            }
        });

        Card7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jeanie\\Documents\\NetBeansProjects\\Matching Game Assignment\\Card Background!.jpg")); // NOI18N
        Card7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card7ActionPerformed(evt);
            }
        });

        Card8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jeanie\\Documents\\NetBeansProjects\\Matching Game Assignment\\Card Background!.jpg")); // NOI18N
        Card8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card8ActionPerformed(evt);
            }
        });

        Card9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jeanie\\Documents\\NetBeansProjects\\Matching Game Assignment\\Card Background!.jpg")); // NOI18N
        Card9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card9ActionPerformed(evt);
            }
        });

        Card10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jeanie\\Documents\\NetBeansProjects\\Matching Game Assignment\\Card Background!.jpg")); // NOI18N
        Card10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card10ActionPerformed(evt);
            }
        });

        Card11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jeanie\\Documents\\NetBeansProjects\\Matching Game Assignment\\Card Background!.jpg")); // NOI18N
        Card11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card11ActionPerformed(evt);
            }
        });

        Card12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jeanie\\Documents\\NetBeansProjects\\Matching Game Assignment\\Card Background!.jpg")); // NOI18N
        Card12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card12ActionPerformed(evt);
            }
        });

        btnPlay.setText("Play");
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });

        btnGuessAgain.setText("Guess Again");
        btnGuessAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuessAgainActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        txtInstructionsOutput.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtInstructionsOutput.setText("Click the Play button to start. Make sure to click Guess Again after each guess.");

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(txtInstructionsOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addComponent(btnPlay)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGuessAgain)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Card9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Card1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Card5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addComponent(Card10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Card11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Card12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                    .addComponent(Card6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Card7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Card8))
                                .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                    .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                            .addComponent(Card2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(Card3))
                                        .addComponent(lblTitle))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Card4))
                                .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                    .addComponent(btnExit)
                                    .addGap(297, 297, 297)
                                    .addComponent(lblJeanieNg))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Card4)
                    .addComponent(Card2)
                    .addComponent(Card3)
                    .addComponent(Card5))
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Card10)
                            .addComponent(Card11)))
                    .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                            .addGap(126, 126, 126)
                            .addComponent(Card12))
                        .addGroup(pnlBackgroundLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Card1)
                                .addComponent(Card6)
                                .addComponent(Card7)
                                .addComponent(Card8))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Card9))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(txtInstructionsOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJeanieNg)
                    .addComponent(btnPlay)
                    .addComponent(btnGuessAgain)
                    .addComponent(btnExit))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
    System.exit(0); //Exits the program when the "Exit" button is clicked
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        /*
        Sets change array
        Converts all the default values in the change array to value "1"
        If the card has not been matched, "1" is representative of that
        (If the card is matched, the value of the card becomes "2")
        */
        for (int z = 0; z <= 11; z++) {
            change[z] = 1;
        } 
        
        /*
        For loop generates 0,0,1,1 etc. up to 5,5 which are added to the "set" array list and will then be applied to cards in random order 
        Same values represent a match
        */
        String temp;
        for (int x = 0; x <= 5; x++) {
            for (int y = 1; y <= 2; y++) {
                temp = Integer.toString(x);
                set.add(temp);
            }
        }
        
        /*
        Numbers that were previously in order in the set array list are randomized
        Numbers are put into array list cards and removed from array list set
        */
        for (int x = 0; x <= 11; x++) {
            double index = Math.floor(Math.random()*(12-x));
            int index1 = (int)index;
            cards.add(set.get(index1));
            set.remove(set.get(index1));
        }
    }//GEN-LAST:event_btnPlayActionPerformed

    private void Card1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card1ActionPerformed
     
    String temp = cards.get(0); //Gets number from cards at index zero, stores it in a temporary string
        
        /*
        If statement identifies the value at index zero and will match it with a corresponding icon
        In the cards array list, there are two values that are the SAME at two different indices, meaning that the same icon will appear twice, giving the user their match
        */
        if (temp.equals("0")) {
            Card1.setIcon(a);
        } else if (temp.equals("1")) {
            Card1.setIcon(b);
        } else if (temp.equals("2")) {
            Card1.setIcon(c);
        } else if (temp.equals("3")) {
            Card1.setIcon(d);
        } else if (temp.equals("4")) {
            Card1.setIcon(e);
        } else if (temp.equals("5")) {
            Card1.setIcon(f);
        } 
        
        /*
        Counter will increase by one when the button is clicked; every button that is a card has this code attached to it 
        This means that when the button is clicked, it may result in the count array having a value of 1 or 2 
        If it has a value of 1, the c1 varaible is given the value of the (integer) temporary variable from the cards array list
        If it has a value of 2, the c2 varaible is given the value of the (integer) temporary varaible from the cards array list
        Either way, the value 0 (increasesby 1 every button) in the change array is given the value 0 
        */
        count++;
        if (count == 1) {
            c1 = Integer.parseInt(temp);
            change[0] = 0;
        } else if (count == 2) {
            c2 = Integer.parseInt(temp);
            change[0] = 0;
        }    
    }//GEN-LAST:event_Card1ActionPerformed
    
//The following buttons (Card2-Card12) use the same code as Card1ActionPerformed, except the index in array list cards will increase by one and the value in the change array will also increase by one 
    private void Card2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card2ActionPerformed
         String temp = cards.get(1);
        
        if (temp.equals("0")) {
            Card2.setIcon(a);
        } else if (temp.equals("1")) {
            Card2.setIcon(b);
        } else if (temp.equals("2")) {
            Card2.setIcon(c);
        } else if (temp.equals("3")) {
            Card2.setIcon(d);
        } else if (temp.equals("4")) {
            Card2.setIcon(e);
        } else if (temp.equals("5")) {
            Card2.setIcon(f);
        }
        
        count++;
        if (count == 1) {
            c1 = Integer.parseInt(temp);
            change[1] = 0;
        } else if (count == 2) {
            c2 = Integer.parseInt(temp);
            change[1] = 0;
   
        }
    }//GEN-LAST:event_Card2ActionPerformed

    private void Card3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card3ActionPerformed
     String temp = cards.get(2);
        
        if (temp.equals("0")) {
            Card3.setIcon(a);
        } else if (temp.equals("1")) {
            Card3.setIcon(b);
        } else if (temp.equals("2")) {
            Card3.setIcon(c);
        } else if (temp.equals("3")) {
            Card3.setIcon(d);
        } else if (temp.equals("4")) {
            Card3.setIcon(e);
        } else if (temp.equals("5")) {
            Card3.setIcon(f);
        }
        
        count++;
        if (count == 1) {
            c1 = Integer.parseInt(temp);
            change[2] = 0;
        } else if (count == 2) {
            c2 = Integer.parseInt(temp);
            change[2] = 0;
        }
    }//GEN-LAST:event_Card3ActionPerformed

    private void Card4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card4ActionPerformed
     String temp = cards.get(3);
        
        if (temp.equals("0")) {
            Card4.setIcon(a);
        } else if (temp.equals("1")) {
            Card4.setIcon(b);
        } else if (temp.equals("2")) {
            Card4.setIcon(c);
        } else if (temp.equals("3")) {
            Card4.setIcon(d);
        } else if (temp.equals("4")) {
            Card4.setIcon(e);
        } else if (temp.equals("5")) {
            Card4.setIcon(f);
        } 
        
        count++;
        if (count == 1) {
            c1 = Integer.parseInt(temp);
            change[3] = 0;
        } else if (count == 2) {
            c2 = Integer.parseInt(temp);
            change[3] = 0;
        }
    }//GEN-LAST:event_Card4ActionPerformed

    private void Card5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card5ActionPerformed
    String temp = cards.get(4);
        
        if (temp.equals("0")) {
            Card5.setIcon(a);
        } else if (temp.equals("1")) {
            Card5.setIcon(b);
        } else if (temp.equals("2")) {
            Card5.setIcon(c);
        } else if (temp.equals("3")) {
            Card5.setIcon(d);
        } else if (temp.equals("4")) {
            Card5.setIcon(e);
        } else if (temp.equals("5")) {
            Card5.setIcon(f);
        } 
        
        count++;
        if (count == 1) {
            c1 = Integer.parseInt(temp);
            change[4] = 0;
        } else if (count == 2) {
            c2 = Integer.parseInt(temp);
            change[4] = 0;
        }
    }//GEN-LAST:event_Card5ActionPerformed

    private void Card6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card6ActionPerformed
     String temp = cards.get(5);
        
        if (temp.equals("0")) {
            Card6.setIcon(a);
        } else if (temp.equals("1")) {
            Card6.setIcon(b);
        } else if (temp.equals("2")) {
            Card6.setIcon(c);
        } else if (temp.equals("3")) {
            Card6.setIcon(d);
        } else if (temp.equals("4")) {
            Card6.setIcon(e);
        } else if (temp.equals("5")) {
            Card6.setIcon(f);
        } 
        
        count++;
        if (count == 1) {
            c1 = Integer.parseInt(temp);
            change[5] = 0;
        } else if (count == 2) {
            c2 = Integer.parseInt(temp);
            change[5] = 0;
        }
    }//GEN-LAST:event_Card6ActionPerformed

    private void Card7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card7ActionPerformed
     String temp = cards.get(6);
        
        if (temp.equals("0")) {
            Card7.setIcon(a);
        } else if (temp.equals("1")) {
            Card7.setIcon(b);
        } else if (temp.equals("2")) {
            Card7.setIcon(c);
        } else if (temp.equals("3")) {
            Card7.setIcon(d);
        } else if (temp.equals("4")) {
            Card7.setIcon(e);
        } else if (temp.equals("5")) {
            Card7.setIcon(f);
        } 
        
        count++;
        if (count == 1) {
            c1 = Integer.parseInt(temp);
            change[6] = 0;
        } else if (count == 2) {
            c2 = Integer.parseInt(temp);
            change[6] = 0;
        }   
    }//GEN-LAST:event_Card7ActionPerformed

    private void Card8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card8ActionPerformed
     String temp = cards.get(7);
        
        if (temp.equals("0")) {
            Card8.setIcon(a);
        } else if (temp.equals("1")) {
            Card8.setIcon(b);
        } else if (temp.equals("2")) {
            Card8.setIcon(c);
        } else if (temp.equals("3")) {
            Card8.setIcon(d);
        } else if (temp.equals("4")) {
            Card8.setIcon(e);
        } else if (temp.equals("5")) {
            Card8.setIcon(f);
        }
        
        count++;
        if (count == 1) {
            c1 = Integer.parseInt(temp);
            change[7] = 0;
        } else if (count == 2) {
            c2 = Integer.parseInt(temp);
            change[7] = 0;
        }
    }//GEN-LAST:event_Card8ActionPerformed

    private void Card9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card9ActionPerformed
     String temp = cards.get(8);
        
        if (temp.equals("0")) {
            Card9.setIcon(a);
        } else if (temp.equals("1")) {
            Card9.setIcon(b);
        } else if (temp.equals("2")) {
            Card9.setIcon(c);
        } else if (temp.equals("3")) {
            Card9.setIcon(d);
        } else if (temp.equals("4")) {
            Card9.setIcon(e);
        } else if (temp.equals("5")) {
            Card9.setIcon(f);
        } 
        
        count++;
        if (count == 1) {
            c1 = Integer.parseInt(temp);
            change[8] = 0;
        } else if (count == 2) {
            c2 = Integer.parseInt(temp);
            change[8] = 0;
        }  
    }//GEN-LAST:event_Card9ActionPerformed

    private void Card10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card10ActionPerformed
      String temp = cards.get(9);
        
        if (temp.equals("0")) {
            Card10.setIcon(a);
        } else if (temp.equals("1")) {
            Card10.setIcon(b);
        } else if (temp.equals("2")) {
            Card10.setIcon(c);
        } else if (temp.equals("3")) {
            Card10.setIcon(d);
        } else if (temp.equals("4")) {
            Card10.setIcon(e);
        } else if (temp.equals("5")) {
            Card10.setIcon(f);
        } 
        
        count++;
        if (count == 1) {
            c1 = Integer.parseInt(temp);
            change[9] = 0;
        } else if (count == 2) {
            c2 = Integer.parseInt(temp);
            change[9] = 0;
        }    
    }//GEN-LAST:event_Card10ActionPerformed

    private void Card11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card11ActionPerformed
      String temp = cards.get(10);
        
        if (temp.equals("0")) {
            Card11.setIcon(a);
        } else if (temp.equals("1")) {
            Card11.setIcon(b);
        } else if (temp.equals("2")) {
            Card11.setIcon(c);
        } else if (temp.equals("3")) {
            Card11.setIcon(d);
        } else if (temp.equals("4")) {
            Card11.setIcon(e);
        } else if (temp.equals("5")) {
            Card11.setIcon(f);
        }
        
        count++;
        if (count == 1) {
            c1 = Integer.parseInt(temp);
            change[10] = 0;
        } else if (count == 2) {
            c2 = Integer.parseInt(temp);
            change[10] = 0;
        }    
    }//GEN-LAST:event_Card11ActionPerformed

    private void Card12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card12ActionPerformed
    String temp = cards.get(11);
        
        if (temp.equals("0")) {
            Card12.setIcon(a);
        } else if (temp.equals("1")) {
            Card12.setIcon(b);
        } else if (temp.equals("2")) {
            Card12.setIcon(c);
        } else if (temp.equals("3")) {
            Card12.setIcon(d);
        } else if (temp.equals("4")) {
            Card12.setIcon(e);
        } else if (temp.equals("5")) {
            Card12.setIcon(f);
        } 
        
        count++;
        if (count == 1) {
            c1 = Integer.parseInt(temp);
            change[11] = 0;
        } else if (count == 2) {
            c2 = Integer.parseInt(temp);
            change[11] = 0;
        }    
    }//GEN-LAST:event_Card12ActionPerformed

    private void btnGuessAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuessAgainActionPerformed
    count = 0; //count variable is reset
        /*
        If statement goes through the scenario that the user gets a match (i.e. c1 == c2)
        For loop designates an int y variable, which only has the values 1 & 2
        The inner if statement verifies which card was clicked (i.e. if the first button was clicked, which was designated a "value" of zero from the change array, it will have a value of zero; this will prompt the program to switch the icon on the button to the "done" icon
        The value of the first, second, third etc. button in accordance to the change array is then given the value 2 (meaning that it is no longer in play) 
        Else, the value is set back to one, meaning the card is still in play (i.e. buttons that are cliked have a value of zero, buttons that are not clicked will have a value of one, buttons that are matched will be designated a value of two)
        */
        if (c1 == c2) {
            for (int y = 1; y <= 2; y++) {
                if (change[0] == 0) {
                    Card1.setIcon(done);
                    change[0] = 2;
                } else if (change[1] == 0) {
                    Card2.setIcon(done);
                    change[1] = 2;
                } else if (change[2] == 0) {
                    Card3.setIcon(done);
                    change[2] = 2;
                } else if (change[3] == 0) {
                    Card4.setIcon(done);
                    change[3] = 2;
                } else if (change[4] == 0) {
                    Card5.setIcon(done);
                    change[4] = 2;
                } else if (change[5] == 0) {
                    Card6.setIcon(done);
                    change[5] = 2;
                } else if (change[6] == 0) {
                    Card7.setIcon(done);
                    change[6] = 2;
                } else if (change[7] == 0) {
                    Card8.setIcon(done);
                    change[7] = 2;
                } else if (change[8] == 0) {
                    Card9.setIcon(done);
                    change[8] = 2;
                } else if (change[9] == 0) {
                    Card10.setIcon(done);
                    change[9] = 2;
                } else if (change[10] == 0) {
                    Card11.setIcon(done);
                    change[10] = 2;
                } else if (change[11] == 0) {
                    Card12.setIcon(done);
                    change[11] = 2;
                }
            }
         
        }    
        else {

            for (int z = 1; z <= 2; z++) {

                if (change[0] == 0) {
                    Card1.setIcon(back);
                    change[0] = 1;
                } else if (change[1] == 0) {
                    Card2.setIcon(back);
                    change[1] = 1;
                } else if (change[2] == 0) {
                    Card3.setIcon(back);
                    change[2] = 1;
                } else if (change[3] == 0) {
                    Card4.setIcon(back);
                    change[3] = 1;
                } else if (change[4] == 0) {
                    Card5.setIcon(back);
                    change[4] = 1;
                } else if (change[5] == 0) {
                    Card6.setIcon(back);
                    change[5] = 1;
                } else if (change[6] == 0) {
                    Card7.setIcon(back);
                    change[6] = 1;
                } else if (change[7] == 0) {
                    Card8.setIcon(back);
                    change[7] = 1;
                } else if (change[8] == 0) {
                    Card9.setIcon(back);
                    change[8] = 1;
                } else if (change[9] == 0) {
                    Card10.setIcon(back);
                    change[9] = 1;
                } else if (change[10] == 0) {
                    Card11.setIcon(back);
                    change[10] = 1;
                } else if (change[11] == 0) {
                    Card12.setIcon(back);
                    change[11] = 1;
                } 
                
            }
        }
    boolean isCongratulations = true; //Declaration of boolean value
    /*
    For loop increases int i by one as long as i < the length of the change array
    If any of the buttons/cards have not been matched (i.e. they are still in play), isCongratulations is set to false
    */
    for (int i = 0; i < change.length; i++) {
        if (change[i] != 2) {
            isCongratulations = false; 
        }  
    }
    if (isCongratulations) {
        txtInstructionsOutput.setText("Congratulations.");
    } //If isCongratulations is true, txtInstructionsOutput will set text to "Congratulations."
    }//GEN-LAST:event_btnGuessAgainActionPerformed
    
    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MatchingGameAssignmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatchingGameAssignmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatchingGameAssignmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatchingGameAssignmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MatchingGameAssignmentGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Card1;
    private javax.swing.JButton Card10;
    private javax.swing.JButton Card11;
    private javax.swing.JButton Card12;
    private javax.swing.JButton Card2;
    private javax.swing.JButton Card3;
    private javax.swing.JButton Card4;
    private javax.swing.JButton Card5;
    private javax.swing.JButton Card6;
    private javax.swing.JButton Card7;
    private javax.swing.JButton Card8;
    private javax.swing.JButton Card9;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGuessAgain;
    private javax.swing.JButton btnPlay;
    private javax.swing.JLabel lblJeanieNg;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JTextField txtInstructionsOutput;
    // End of variables declaration//GEN-END:variables
}
