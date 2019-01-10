package com.zking.ssm.util;

import java.io.Serializable;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class PageBean implements Serializable {

	private static final long serialVersionUID = 2422581023658455731L;

	//页码
	private int page=1;
	//每页显示记录数
	private int rows=10;
	//总记录数
	private int total=0;
	//是否分页
	private boolean isPagination=true;
	//上一次的请求路径
	private String url;
	//获取所有的请求参数
	private Map<String,String[]> map;
	
	public PageBean() {
		super();
	}
	
	//设置请求参数
	public void setRequest(HttpServletRequest req) {
		String page=req.getParameter("page");
		String rows=req.getParameter("rows");
		String pagination=req.getParameter("pagination");
		this.setPage(page);
		this.setRows(rows);
		this.setPagination(pagination);
		this.url=req.getContextPath()+req.getServletPath();
		this.map=req.getParameterMap();
	}
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Map<String, String[]> getMap() {
		return map;
	}

	public void setMap(Map<String, String[]> map) {
		this.map = map;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}
	
	public void setPage(String page) {
		if(null!=page&&!"".equals(page.trim()))
			this.page = Integer.parseInt(page);
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}
	
	public void setRows(String rows) {
		if(null!=rows&&!"".equals(rows.trim()))
			this.rows = Integer.parseInt(rows);
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	public void setTotal(String total) {
		this.total = Integer.parseInt(total);
	}

	public boolean isPagination() {
		return isPagination;
	}
	
	public void setPagination(boolean isPagination) {
		this.isPagination = isPagination;
	}
	
	public void setPagination(String isPagination) {
		if(null!=isPagination&&!"".equals(isPagination.trim()))
			this.isPagination = Boolean.parseBoolean(isPagination);
	}
	
	/**
	 * 获取分页起始标记位置
	 * @return
	 */
	public int getStartIndex() {
		//(当前页码-1)*显示记录数
		return (this.getPage()-1)*this.rows;
	}
	
	/**
	 * 末页
	 * @return
	 */
	public int getMaxPage() {
		int totalpage=this.total/this.rows;
		if(this.total%this.rows!=0)
			totalpage++;
		return totalpage;
	}
	
	/**
	 * 下一页
	 * @return
	 */
	public int getNextPage() {
		int nextPage=this.page+1;
		if(this.page>=this.getMaxPage())
			nextPage=this.getMaxPage();
		return nextPage;
	}
	
	/**
	 * 上一页
	 * @return
	 */
	public int getPreivousPage() {
		int previousPage=this.page-1;
		if(previousPage<1)
			previousPage=1;
		return previousPage;
	}

	@Override
	public String toString() {
		return "PageBean [page=" + page + ", rows=" + rows + ", total=" + total + ", isPagination=" + isPagination
				+ "]";
	}
}
