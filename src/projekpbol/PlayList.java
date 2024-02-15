package projekpbol;

import list.Item;
import java.awt.Cursor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class PlayList extends javax.swing.JFrame {

    private ImageIcon playIcon, pauseIcon, playIcon1, pauseIcon1, repeatIcon, loveIcon;
    private boolean isClicked = false;
    private int size;

    /**
     * Creates new form PlayList
     */
    public PlayList() {
        initComponents();

        songCover.setIcon(new ImageIcon(getClass().getResource("/songCover/Coldplay_-_A_Head_Full_of_Dreams.png")));
        playIcon = new ImageIcon(getClass().getResource("/icon/playButton.png"));
        pauseIcon = new ImageIcon(getClass().getResource("/icon/pauseButton.png"));
        playIcon1 = new ImageIcon(getClass().getResource("/icon/play11.png"));
        pauseIcon1 = new ImageIcon(getClass().getResource("/icon/pause11.png"));
        repeatIcon = new ImageIcon(getClass().getResource("/icon/repeat.png"));
        loveIcon = new ImageIcon(getClass().getResource("/icon/love_bot.png"));
        playButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        playButton1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        songList.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        backButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        nextButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        songCover.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        loveButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        addSong.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        deleteSong.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        setLocationRelativeTo(null);
        menuBar2.setWindow(this);

        try {
            load();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "error", 0);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        menuBar2 = new component.MenuBar();
        gradient1 = new component.Gradient();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new  button.ScrollPane();
        songList = new list.MyList<>();
        playButton1 = new button.MyButton();
        panelRound3 = new panelRounded.PanelRound();
        addSong = new button.MyButton();
        deleteSong = new button.MyButton();
        panelRound1 = new panelRounded.PanelRound();
        songCover = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        loveButton = new button.MyButton();
        playButton = new button.MyButton();
        backButton = new button.MyButton();
        nextButton = new button.MyButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(926, 549));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(926, 549));
        jPanel1.setPreferredSize(new java.awt.Dimension(926, 549));
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentResized(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/AlbumColdplay (1).jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Footlight MT Light", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Western Playlist");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("0 Song/s");

        jScrollPane1.setBorder(null);

        songList.setBackground(new java.awt.Color(115, 124, 129));
        songList.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(songList);

        playButton1.setBackground(new java.awt.Color(94, 113, 141));
        playButton1.setBorder(null);
        playButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/play11.png"))); // NOI18N
        playButton1.setBorderColor(new java.awt.Color(94, 113, 141));
        playButton1.setColor(new java.awt.Color(94, 113, 141));
        playButton1.setColorClick(new java.awt.Color(73, 97, 114));
        playButton1.setColorOver(new java.awt.Color(73, 97, 114));
        playButton1.setRadius(500);
        playButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playButton1MouseClicked(evt);
            }
        });
        playButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gradient1Layout = new javax.swing.GroupLayout(gradient1);
        gradient1.setLayout(gradient1Layout);
        gradient1Layout.setHorizontalGroup(
            gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradient1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(playButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(599, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        gradient1Layout.setVerticalGroup(
            gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradient1Layout.createSequentialGroup()
                .addGroup(gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(gradient1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(playButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        addSong.setBackground(new java.awt.Color(105, 105, 105));
        addSong.setBorder(null);
        addSong.setForeground(new java.awt.Color(255, 255, 255));
        addSong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/addSong.png"))); // NOI18N
        addSong.setText("Tambah Lagu");
        addSong.setBorderColor(new java.awt.Color(105, 105, 105));
        addSong.setColor(new java.awt.Color(105, 105, 105));
        addSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSongActionPerformed(evt);
            }
        });

        deleteSong.setBackground(new java.awt.Color(105, 105, 105));
        deleteSong.setBorder(null);
        deleteSong.setForeground(new java.awt.Color(255, 255, 255));
        deleteSong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/trashCan.png"))); // NOI18N
        deleteSong.setText("Delete Lagu");
        deleteSong.setBorderColor(new java.awt.Color(105, 105, 105));
        deleteSong.setColor(new java.awt.Color(105, 105, 105));
        deleteSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(panelRound3);
        panelRound3.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addSong, javax.swing.GroupLayout.PREFERRED_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(deleteSong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addSong, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteSong, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        songCover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/songCover/default.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Now Playing . . .");

        jLabel5.setFont(new java.awt.Font("FZYaoTi", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("None");

        loveButton.setBackground(new java.awt.Color(105, 105, 105));
        loveButton.setBorder(null);
        loveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/love_bot.png"))); // NOI18N
        loveButton.setBorderColor(new java.awt.Color(105, 105, 105));
        loveButton.setColor(new java.awt.Color(105, 105, 105));
        loveButton.setRadius(500);
        loveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loveButtonMouseClicked(evt);
            }
        });
        loveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loveButtonActionPerformed(evt);
            }
        });

        playButton.setBackground(new java.awt.Color(105, 105, 105));
        playButton.setBorder(null);
        playButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/playButton.png"))); // NOI18N
        playButton.setBorderColor(new java.awt.Color(66, 66, 66));
        playButton.setColor(new java.awt.Color(105, 105, 105));
        playButton.setRadius(500);
        playButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playButtonMouseClicked(evt);
            }
        });
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(105, 105, 105));
        backButton.setBorder(null);
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        backButton.setBorderColor(new java.awt.Color(105, 105, 105));
        backButton.setColor(new java.awt.Color(105, 105, 105));
        backButton.setRadius(500);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        nextButton.setBackground(new java.awt.Color(105, 105, 105));
        nextButton.setBorder(null);
        nextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/next.png"))); // NOI18N
        nextButton.setBorderColor(new java.awt.Color(105, 105, 105));
        nextButton.setColor(new java.awt.Color(105, 105, 105));
        nextButton.setRadius(500);
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addComponent(songCover, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRound1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelRound1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(loveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelRound1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelRound1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(songCover))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(menuBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 908, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(gradient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(menuBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gradient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelRound3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentResized

    }//GEN-LAST:event_jPanel1ComponentResized

    private void loveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loveButtonMouseClicked
        if (isClicked) {

            ImageIcon newIcon = new ImageIcon(getClass().getResource("/icon/love_selected.png"));
            loveButton.setIcon(newIcon);
        } else {

            loveButton.setIcon(loveIcon);

        }

        // Toggle isClicked
        isClicked = !isClicked;
    }//GEN-LAST:event_loveButtonMouseClicked

    private void loveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loveButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loveButtonActionPerformed

    private void playButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playButtonMouseClicked

    }//GEN-LAST:event_playButtonMouseClicked

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        int selectedIndex = songList.getSelectedIndex();
        for (String path : Music.path) {
            Music.stopMusic(path);
        }
        if (isClicked) {
            playButton.setIcon(playIcon);
            Music.stopMusic(Music.path.get(selectedIndex));
            jLabel5.setText("None");
            isClicked = false;
        } else {
            playButton.setIcon(pauseIcon);
            Engine engine = new Engine(this, selectedIndex);
            engine.start();
            isClicked = true;
        }
    }//GEN-LAST:event_playButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        try{
            int selectedIndex = songList.getSelectedIndex();
            for (String path : Music.path) {
                Music.stopMusic(path);
            }
            
            if (songList.getSelectedIndex() != 0) {
                selectedIndex -= 1;
            }else{
                selectedIndex = size-1;
            }
            songList.setSelectedIndex(selectedIndex);
            playButton.setIcon(pauseIcon);
            Music.playMusic(Music.path.get(selectedIndex));

            jLabel5.setText(Music.name.get(selectedIndex));
            isClicked = true;
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_backButtonActionPerformed

    private void playButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playButton1MouseClicked

    }//GEN-LAST:event_playButton1MouseClicked

    private void playButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButton1ActionPerformed
        for (String path : Music.path) {
            Music.stopMusic(path);
        }
        int selectedIndex = songList.getSelectedIndex();
        playButton.setIcon(pauseIcon);
        Engine engine = new Engine(this, selectedIndex);
        engine.start();
        isClicked = true;
    }//GEN-LAST:event_playButton1ActionPerformed

    private void addSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSongActionPerformed
        JFileChooser choose = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("wav File", "wav");
        choose.setFileFilter(filter);
        int status = choose.showOpenDialog(this);
        switch (status) {
            case JFileChooser.APPROVE_OPTION:
                boolean same = false;
                for (int i = 0; i < Music.path.size(); i++) {
                    if (choose.getSelectedFile().getAbsolutePath().equals(Music.path.get(i))) {
                        same = true;
                    }
                }
                if (!same) {
                    Music.path.add(choose.getSelectedFile().getAbsolutePath());
                    String temp = choose.getSelectedFile().getName();
                    temp = temp.substring(0, temp.length() - 4);
                    Music.name.add(temp);
                    songList.addItem(new Item(temp,
                            new ImageIcon(getClass().getResource("/icon/test/coldplay.jpg"))));
                    size++;
                    jLabel3.setText(size + " song/s");
                    songList.setSelectedIndex(Music.path.size()-1);
                } else {
                    JOptionPane.showMessageDialog(this, "Tolong masukan file yang berbeda", "Error", 0);
                }
                break;
            default:
                break;
        }
    }//GEN-LAST:event_addSongActionPerformed

    private void deleteSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSongActionPerformed
        int selectedIndex = songList.getSelectedIndex();
        songList.remove(selectedIndex);
        Music.path.remove(selectedIndex);
        Music.name.remove(selectedIndex);
        size--;
        jLabel3.setText(size + " song/s");
    }//GEN-LAST:event_deleteSongActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
//        int selectedIndex = songList.getSelectedIndex();
//        for (String path : Music.path) {
//            Music.stopMusic(path);
//        }
//        selectedIndex += 1;
//        if (selectedIndex == size - 1) {
//            selectedIndex = -1;
//        }
//        songList.setSelectedIndex(selectedIndex);
//        playButton.setIcon(pauseIcon);
//        Music.playMusic(Music.path.get(selectedIndex));
//        jLabel5.setText(songList.getText(selectedIndex));
//        isClicked = true;
        try {
            int selectedIndex = songList.getSelectedIndex();
            for (String path : Music.path) {
                Music.stopMusic(path);
            }
            selectedIndex += 1;
            if (selectedIndex == size ) {
               selectedIndex = 0;
            }
            songList.setSelectedIndex(selectedIndex);
            playButton.setIcon(pauseIcon);
            Music.playMusic(Music.path.get(selectedIndex));
            jLabel5.setText(Music.name.get(selectedIndex));
            isClicked = true;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_nextButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(PlayList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayList().setVisible(true);
            }
        });
    }

    private void load() throws FileNotFoundException, IOException, ClassNotFoundException {
        File file = new File("C:/savedata");
        file.mkdir();
        file = new File("C:/savedata/playlist.sav");

        if (file.exists()) {
            FileInputStream fs = new FileInputStream(file);
            ObjectInputStream os = new ObjectInputStream(fs);
            Music.path = (ArrayList) os.readObject();
            Music.name = (ArrayList) os.readObject();

            for (int i = 0; i < Music.path.size(); i++) {
                songList.addItem(new Item(Music.name.get(i),
                        new ImageIcon(getClass().getResource("/icon/test/coldplay.jpg"))));
                size++;
            }

            jLabel3.setText(size + " song/s");
            songList.setSelectedIndex(0);
        }
    }

    public void setJLabel5(String s) {
        jLabel5.setText(s);
    }
    
    public list.MyList<String> getSongList(){
        return songList;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private button.MyButton addSong;
    private button.MyButton backButton;
    private button.MyButton deleteSong;
    private component.Gradient gradient1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private button.MyButton loveButton;
    private component.MenuBar menuBar2;
    private button.MyButton nextButton;
    private panelRounded.PanelRound panelRound1;
    private panelRounded.PanelRound panelRound3;
    private button.MyButton playButton;
    private button.MyButton playButton1;
    private javax.swing.JLabel songCover;
    private list.MyList<String> songList;
    // End of variables declaration//GEN-END:variables
}