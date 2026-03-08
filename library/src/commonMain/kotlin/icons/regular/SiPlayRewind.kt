package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiPlayRewind: ImageVector
    get() {
        if (_SiPlayRewind != null) {
            return _SiPlayRewind!!
        }
        _SiPlayRewind = ImageVector.Builder(
            name = "Regular.SiPlayRewind",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 12f)
                lineToRelative(-0.43f, -0.614f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.228f)
                close()
                moveTo(13f, 5f)
                horizontalLineToRelative(0.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.18f, -0.614f)
                close()
                moveTo(13f, 19f)
                lineTo(12.57f, 19.614f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.75f, 19f)
                close()
                moveTo(13.75f, 14.133f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                horizontalLineToRelative(1.5f)
                moveTo(10f, 12f)
                lineToRelative(-0.43f, -0.614f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.228f)
                close()
                moveTo(20f, 5f)
                horizontalLineToRelative(0.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.18f, -0.614f)
                close()
                moveTo(20f, 19f)
                lineTo(19.57f, 19.614f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.75f, 19f)
                close()
                moveTo(3f, 12f)
                lineToRelative(0.43f, 0.614f)
                lineToRelative(10f, -7f)
                lineTo(13f, 5f)
                lineToRelative(-0.43f, -0.614f)
                lineToRelative(-10f, 7f)
                close()
                moveTo(13f, 19f)
                lineTo(13.43f, 18.386f)
                lineTo(3.43f, 11.386f)
                lineTo(3f, 12f)
                lineToRelative(-0.43f, 0.614f)
                lineToRelative(10f, 7f)
                close()
                moveTo(13f, 5f)
                horizontalLineToRelative(-0.75f)
                verticalLineToRelative(4.688f)
                horizontalLineToRelative(1.5f)
                lineTo(13.75f, 5f)
                close()
                moveTo(13f, 14.133f)
                horizontalLineToRelative(-0.75f)
                lineTo(12.25f, 19f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-4.867f)
                close()
                moveTo(10f, 12f)
                lineToRelative(0.43f, 0.614f)
                lineToRelative(10f, -7f)
                lineTo(20f, 5f)
                lineToRelative(-0.43f, -0.614f)
                lineToRelative(-10f, 7f)
                close()
                moveTo(20f, 5f)
                horizontalLineToRelative(-0.75f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(1.5f)
                lineTo(20.75f, 5f)
                close()
                moveTo(20f, 19f)
                lineTo(20.43f, 18.386f)
                lineTo(10.43f, 11.386f)
                lineTo(10f, 12f)
                lineToRelative(-0.43f, 0.614f)
                lineToRelative(10f, 7f)
                close()
            }
        }.build()

        return _SiPlayRewind!!
    }

@Suppress("ObjectPropertyName")
private var _SiPlayRewind: ImageVector? = null
