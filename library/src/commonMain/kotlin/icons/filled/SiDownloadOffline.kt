package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiDownloadOffline: ImageVector
    get() {
        if (_SiDownloadOffline != null) {
            return _SiDownloadOffline!!
        }
        _SiDownloadOffline = ImageVector.Builder(
            name = "Filled.SiDownloadOffline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1f, 12f)
                curveTo(1f, 5.925f, 5.925f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.925f, 11f, 11f)
                reflectiveCurveToRelative(-4.925f, 11f, -11f, 11f)
                reflectiveCurveTo(1f, 18.075f, 1f, 12f)
                moveToRelative(12f, -6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(6.586f)
                lineToRelative(-2.293f, -2.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.414f, 1.414f)
                lineToRelative(4f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.414f, 0f)
                lineToRelative(4f, -4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.414f, -1.414f)
                lineTo(13f, 12.586f)
                close()
                moveTo(7f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2f)
                horizontalLineTo(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
            }
        }.build()

        return _SiDownloadOffline!!
    }

@Suppress("ObjectPropertyName")
private var _SiDownloadOffline: ImageVector? = null
