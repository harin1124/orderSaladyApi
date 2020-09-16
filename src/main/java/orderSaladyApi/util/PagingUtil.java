package orderSaladyApi.util;

import java.util.HashMap;

public class PagingUtil{
	private int nowPageNo=0;
	private int startNo=0;
	private int totalCnt=0;
	private int totalPageCnt=0;
	private int startPage=0;
	private int endPage=0;
	private int rowCnt=0;
	private int startTopNo=0;
	
	public PagingUtil(int nowPageNo, int totalCnt){
		this.nowPageNo=nowPageNo;
		this.totalCnt=totalCnt;
		pagingUtilSet();
	}
	
	public PagingUtil(int nowPageNo, int totalCnt, int rowCnt){
		this.nowPageNo=nowPageNo;
		this.totalCnt=totalCnt;
		this.rowCnt=rowCnt;
		pagingUtilSet();
	}
	
	public int getNowPageNo(){
		return nowPageNo;
	}
	public int getStartNo(){
		return startNo;
	}
	public int getTotalCnt(){
		return totalCnt;
	}
	public int getTotalPageCnt(){
		return totalPageCnt;
	}
	public int getStartPage(){
		return startPage;
	}
	public int getEndPage(){
		return endPage;
	}
	public int getRowCnt(){
		return rowCnt;
	}
	public int getStartTopNo(){
		return startTopNo;
	}

	public void pagingUtilSet(){
		totalPageCnt=totalCnt/rowCnt;
		if(totalCnt%rowCnt > 0){
			totalPageCnt++;
		}
		
		if(totalPageCnt<nowPageNo){
			nowPageNo=totalPageCnt;
		}
		startPage=((nowPageNo-1)/10)*10+1;
		endPage=startPage+rowCnt-1;
		if(endPage>totalPageCnt){
			endPage=totalPageCnt;
		}
		//해당 페이지 시작 넘버 세팅
		startTopNo=totalCnt-((nowPageNo-1)*rowCnt);
	}
	
	public HashMap<String, Object> getPagingInfo(){
		HashMap<String, Object> pagingInfo=new HashMap<String, Object>();
		pagingInfo.put("nowPageNo", this.nowPageNo);
		pagingInfo.put("rowCnt", this.rowCnt);
		pagingInfo.put("startNo", (Math.abs(this.nowPageNo-1))*this.rowCnt);
		pagingInfo.put("totalCnt", this.totalCnt);
		pagingInfo.put("totalPageCnt", this.totalPageCnt);
		pagingInfo.put("startPage", this.startPage);
		pagingInfo.put("endPage", this.endPage);
		return pagingInfo;
	}

	@Override
	public String toString(){
		return "PagingUtil [nowPageNo=" + nowPageNo + ", startNo=" + startNo + ", totalCnt=" + totalCnt + ", totalPageCnt=" + totalPageCnt + ", startPage=" + startPage + ", endPage=" + endPage + ", rowCnt=" + rowCnt + ", startTopNo=" + startTopNo + "]";
	}
}