package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiAINoteAlt1: ImageVector
    get() {
        if (_SiAINoteAlt1 != null) {
            return _SiAINoteAlt1!!
        }
        _SiAINoteAlt1 = ImageVector.Builder(
            name = "Filled.SiAINoteAlt1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.2f, 0f)
                arcTo(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 1.8f)
                lineTo(17f, 3f)
                horizontalLineToRelative(1.6f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5.4f)
                verticalLineToRelative(15.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.4f, 2.4f)
                lineTo(5.4f, 23f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 20.6f)
                lineTo(3f, 5.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.4f, 3f)
                lineTo(7f, 3f)
                lineTo(7f, 1.8f)
                arcTo(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.8f, 0f)
                close()
                moveTo(15.827f, 13.587f)
                curveToRelative(-0.232f, -0.93f, -1.52f, -0.959f, -1.817f, -0.087f)
                lineToRelative(-0.026f, 0.087f)
                lineToRelative(-0.296f, 1.187f)
                lineToRelative(-1.188f, 0.297f)
                curveToRelative(-0.96f, 0.24f, -0.96f, 1.603f, 0f, 1.843f)
                lineToRelative(1.188f, 0.297f)
                lineToRelative(0.296f, 1.187f)
                curveToRelative(0.24f, 0.96f, 1.603f, 0.96f, 1.843f, 0f)
                lineToRelative(0.297f, -1.187f)
                lineToRelative(1.188f, -0.297f)
                curveToRelative(0.958f, -0.24f, 0.958f, -1.603f, 0f, -1.843f)
                lineToRelative(-1.188f, -0.297f)
                close()
                moveTo(7f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -2f)
                close()
                moveTo(7f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -2f)
                close()
                moveTo(7f, 9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -2f)
                close()
                moveTo(9f, 2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                lineTo(15f, 2f)
                close()
            }
        }.build()

        return _SiAINoteAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _SiAINoteAlt1: ImageVector? = null
