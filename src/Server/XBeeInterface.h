#if !defined(__XBEE_INTERFACE_H__)
#define __XBEE_INTERFACE_H__

#include "xbee.h"

#include "Util.h"

/*todo: add a memory clean up funciton for XBeeConnectionConfig */
typedef struct
{
  struct xbee_conAddress	address;
  const char*			connectionType;
  xbee_t_conCallback		xbeeCallback;
  void*				connectionData;
  
} XBeeConnectionConfig;

/* Initializes XBee control */
int XBeeRadioInit(const XBeeRadioConfig* xbeeConfig);

/* Detroys XBee control*/
int XBeeRadioDestroy();

/* Creates a connection with remote radio */
int XBeeRadioConnect(XBeeConnectionConfig* conncetionConfig);

/* Disconnects from remote radio */
int XBeeRadioDisconnect();

/* Sends data to remote radio */
int XBeeRadioSend(const unsigned char* data, int len);

/* Receives data from remote radio */
int XBeeRadioReceive(void *buffer, int bufferSize, int wait, int* dataLen);

#endif //__XBEE_INTERFACE_H__