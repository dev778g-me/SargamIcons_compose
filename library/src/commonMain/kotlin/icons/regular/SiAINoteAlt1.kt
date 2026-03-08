package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiAINoteAlt1: ImageVector
    get() {
        if (_SiAINoteAlt1 != null) {
            return _SiAINoteAlt1!!
        }
        _SiAINoteAlt1 = ImageVector.Builder(
            name = "Regular.SiAINoteAlt1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 3f)
                horizontalLineToRelative(2.6f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5.4f)
                verticalLineToRelative(15.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.4f, 2.4f)
                horizontalLineTo(5.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 20.6f)
                verticalLineTo(5.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.4f, 3f)
                horizontalLineTo(8f)
                moveTo(7f, 13f)
                horizontalLineToRelative(4f)
                moveToRelative(-4f, -3f)
                horizontalLineToRelative(10f)
                moveTo(7f, 16f)
                horizontalLineToRelative(2f)
                moveTo(8.8f, 1f)
                horizontalLineToRelative(6.4f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.8f, 0.8f)
                verticalLineToRelative(2.4f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.8f, 0.8f)
                horizontalLineTo(8.8f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.8f, -0.8f)
                verticalLineTo(1.8f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.8f, -0.8f)
                moveToRelative(5.506f, 12.776f)
                lineToRelative(-0.377f, 1.508f)
                arcToRelative(0.2f, 0.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.145f, 0.145f)
                lineToRelative(-1.508f, 0.377f)
                curveToRelative(-0.202f, 0.05f, -0.202f, 0.338f, 0f, 0.388f)
                lineToRelative(1.508f, 0.377f)
                arcToRelative(0.2f, 0.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.145f, 0.145f)
                lineToRelative(0.377f, 1.508f)
                curveToRelative(0.05f, 0.202f, 0.338f, 0.202f, 0.388f, 0f)
                lineToRelative(0.377f, -1.508f)
                arcToRelative(0.2f, 0.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.145f, -0.145f)
                lineToRelative(1.508f, -0.377f)
                curveToRelative(0.202f, -0.05f, 0.202f, -0.337f, 0f, -0.388f)
                lineToRelative(-1.508f, -0.377f)
                arcToRelative(0.2f, 0.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.145f, -0.145f)
                lineToRelative(-0.377f, -1.508f)
                curveToRelative(-0.05f, -0.202f, -0.338f, -0.202f, -0.388f, 0f)
            }
        }.build()

        return _SiAINoteAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _SiAINoteAlt1: ImageVector? = null
