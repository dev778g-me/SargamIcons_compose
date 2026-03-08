package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiAIEditAlt2: ImageVector
    get() {
        if (_SiAIEditAlt2 != null) {
            return _SiAIEditAlt2!!
        }
        _SiAIEditAlt2 = ImageVector.Builder(
            name = "Regular.SiAIEditAlt2",
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
                moveToRelative(17.657f, 9.172f)
                lineToRelative(1.414f, -1.415f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.828f, -2.828f)
                lineToRelative(-1.415f, 1.414f)
                moveToRelative(2.829f, 2.829f)
                lineToRelative(-9.193f, 9.192f)
                lineToRelative(-3.535f, 0.707f)
                lineToRelative(0.707f, -3.535f)
                lineToRelative(9.192f, -9.193f)
                moveToRelative(2.829f, 2.829f)
                lineToRelative(-2.829f, -2.829f)
                moveTo(4.806f, 2.776f)
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
                curveToRelative(0.202f, -0.05f, 0.202f, -0.338f, 0f, -0.388f)
                lineToRelative(-1.508f, -0.377f)
                arcToRelative(0.2f, 0.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.145f, -0.145f)
                lineToRelative(-0.377f, -1.508f)
                curveToRelative(-0.05f, -0.202f, -0.338f, -0.202f, -0.388f, 0f)
                moveTo(19f, 17f)
                lineToRelative(-0.4f, 1.6f)
                lineToRelative(-1.6f, 0.4f)
                lineToRelative(1.6f, 0.4f)
                lineToRelative(0.4f, 1.6f)
                lineToRelative(0.4f, -1.6f)
                lineTo(21f, 19f)
                lineToRelative(-1.6f, -0.4f)
                close()
            }
        }.build()

        return _SiAIEditAlt2!!
    }

@Suppress("ObjectPropertyName")
private var _SiAIEditAlt2: ImageVector? = null
