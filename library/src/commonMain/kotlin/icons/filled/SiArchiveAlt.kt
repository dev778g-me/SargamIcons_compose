package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiArchiveAlt: ImageVector
    get() {
        if (_SiArchiveAlt != null) {
            return _SiArchiveAlt!!
        }
        _SiArchiveAlt = ImageVector.Builder(
            name = "Filled.SiArchiveAlt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 4.6f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.6f, 2f)
                horizontalLineToRelative(18.8f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 4.6f)
                verticalLineToRelative(0.8f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.4f, 8f)
                horizontalLineToRelative(-0.486f)
                lineTo(20f, 18.6f)
                curveToRelative(0f, 1.33f, -1.07f, 2.4f, -2.4f, 2.4f)
                lineTo(6.4f, 21f)
                curveTo(5.07f, 21f, 4f, 19.93f, 4f, 18.6f)
                lineTo(3.086f, 8f)
                lineTo(2.6f, 8f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 5.4f)
                close()
                moveTo(2.6f, 4f)
                arcToRelative(0.6f, 0.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.6f, 0.6f)
                verticalLineToRelative(0.8f)
                arcToRelative(0.6f, 0.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.6f, 0.6f)
                horizontalLineToRelative(18.8f)
                arcToRelative(0.6f, 0.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.6f, -0.6f)
                verticalLineToRelative(-0.8f)
                arcToRelative(0.6f, 0.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.6f, -0.6f)
                close()
                moveTo(8.293f, 10.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.414f, 0f)
                lineTo(12f, 12.586f)
                lineToRelative(2.293f, -2.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.414f, 1.414f)
                lineTo(13.414f, 14f)
                lineToRelative(2.293f, 2.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.414f, 1.414f)
                lineTo(12f, 15.414f)
                lineToRelative(-2.293f, 2.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.414f, -1.414f)
                lineTo(10.586f, 14f)
                lineToRelative(-2.293f, -2.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.414f)
            }
        }.build()

        return _SiArchiveAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiArchiveAlt: ImageVector? = null
