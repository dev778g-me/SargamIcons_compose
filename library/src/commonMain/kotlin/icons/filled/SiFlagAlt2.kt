package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiFlagAlt2: ImageVector
    get() {
        if (_SiFlagAlt2 != null) {
            return _SiFlagAlt2!!
        }
        _SiFlagAlt2 = ImageVector.Builder(
            name = "Filled.SiFlagAlt2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.707f, 1.707f)
                lineTo(17.414f, 9f)
                lineToRelative(4.293f, 4.293f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.985f, 15f)
                lineTo(9.2f, 14.825f)
                lineToRelative(2.706f, 5.75f)
                arcToRelative(1.001f, 1.001f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.81f, 0.85f)
                lineToRelative(-8f, -17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                close()
            }
        }.build()

        return _SiFlagAlt2!!
    }

@Suppress("ObjectPropertyName")
private var _SiFlagAlt2: ImageVector? = null
