package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiArchive: ImageVector
    get() {
        if (_SiArchive != null) {
            return _SiArchive!!
        }
        _SiArchive = ImageVector.Builder(
            name = "Filled.SiArchive",
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
                horizontalLineTo(6.4f)
                curveTo(5.07f, 21f, 4f, 19.93f, 4f, 18.6f)
                lineTo(3.086f, 8f)
                horizontalLineTo(2.6f)
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
                moveTo(15f, 9f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineToRelative(2.2f)
                arcTo(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.8f, 11f)
                horizontalLineToRelative(6.4f)
                arcTo(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 9.2f)
                verticalLineTo(7f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.build()

        return _SiArchive!!
    }

@Suppress("ObjectPropertyName")
private var _SiArchive: ImageVector? = null
