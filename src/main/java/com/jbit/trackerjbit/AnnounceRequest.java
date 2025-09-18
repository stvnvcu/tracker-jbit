package com.jbit.trackerjbit;

public class AnnounceRequest {

    private String infoHash;
    private String peerId;
    private String port;
    private long uploaded;
    private long downloaded;
    private long left;
    private TorrentEvent event;


    public String getInfoHash() {
        return infoHash;
    }

    public void setInfoHash(String infoHash) {
        this.infoHash = infoHash;
    }

    public String getPeerId() {
        return peerId;
    }

    public void setPeerId(String peerId) {
        this.peerId = peerId;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public long getUploaded() {
        return uploaded;
    }

    public void setUploaded(long uploaded) {
        this.uploaded = uploaded;
    }

    public long getDownloaded() {
        return downloaded;
    }

    public void setDownloaded(long downloaded) {
        this.downloaded = downloaded;
    }

    public long getLeft() {
        return left;
    }

    public void setLeft(long left) {
        this.left = left;
    }

    public TorrentEvent getEvent() {
        return event;
    }

    public void setEvent(TorrentEvent event) {
        this.event = event;
    }

    enum TorrentEvent{
        STARTED,
        STOPPED,
        COMPLETED
    }
}
